@file:Suppress("DEPRECATION")

package com.example.wazitoecommerce.data

import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import com.example.wazitoecommerce.models.House
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage


@Suppress("NAME_SHADOWING")
class HouseViewModel(var navController: NavHostController, var context: Context) {
    private var authViewModel:AuthViewModel = AuthViewModel(navController, context)
    var progress: ProgressDialog
    init {
        if (!authViewModel.isLoggedIn()){
            navController.navigate(LOGIN_URL)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun uploadHouse(properties:String, price:String, filePath: Uri){
        val houseId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("Houses/$houseId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{ it ->
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener { it ->
                    val imageUrl = it.toString()
                    val house = House(properties, price ,imageUrl,houseId)
                    val databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("Houses/$houseId")
                    databaseRef.setValue(house).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }else{
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun allHouses(
        house: MutableState<House>,
        houses: SnapshotStateList<House>
    ): SnapshotStateList<House> {
        progress.show()
        val ref = FirebaseDatabase.getInstance().getReference()
            .child("Houses")
        ref.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                houses.clear()
                for (snap in snapshot.children){
                    val retrievedHouse = snap.getValue(House::class.java)
                    house.value = retrievedHouse!!
                    houses.add(retrievedHouse)
                }
                progress.dismiss()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })

        return houses
    }

    fun deleteHouse(houseId:String){
        val ref = FirebaseDatabase.getInstance().getReference()
            .child("Houses/$houseId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}

