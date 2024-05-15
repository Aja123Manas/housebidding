@file:Suppress("DEPRECATION")

package com.example.wazitoecommerce.data

import android.app.ProgressDialog
import android.content.Context
import androidx.navigation.NavHostController
import com.google.firebase.auth.FirebaseAuth

class AuthViewModel(var navController:NavHostController, context:Context) {
    private val mAuth:FirebaseAuth = FirebaseAuth.getInstance()
    private val progress:ProgressDialog

    init {
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun isLoggedIn(): Boolean = mAuth.currentUser != null
}