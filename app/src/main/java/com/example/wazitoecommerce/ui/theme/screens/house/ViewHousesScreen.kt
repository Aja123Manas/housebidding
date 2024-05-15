package com.example.wazitoecommerce.ui.theme.screens.house

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.wazitoecommerce.data.HouseViewModel
import com.example.wazitoecommerce.models.House
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun ViewHousesScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        val context = LocalContext.current
        val houseRepository = HouseViewModel(navController, context)



        val emptyHousesState = remember { mutableStateOf(House("","","","")) }
        val emptyHousesListState = remember { mutableStateListOf<House>() }

        val houses =houseRepository.allHouses(emptyHousesState, emptyHousesListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "All Houses",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn {
                items(houses){
                    HouseItem(
                        properties = it.properties,
                        price = it.price,
                        id = it.id,
                        houseRepository = houseRepository,
                        houseImage = it.imageUrl
                    )
                }
            }
        }
    }
}


@Composable
fun HouseItem(
    properties: String, price: String, id: String,
    houseRepository: HouseViewModel,
    houseImage: String
) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = properties)
        Text(text = price)
        Image(
            painter = rememberAsyncImagePainter(houseImage),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Button(onClick = {
            houseRepository.deleteHouse(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            //navController.navigate(ROUTE_UPDATE_PRODUCTS+"/$id")


        }) {
            Text(text = "Update")
        }


    }
}

@Composable
@Preview(showBackground = true)
fun ViewPreview(){
    WazitoECommerceTheme {
        ViewHousesScreen(navController = rememberNavController())
    }
}


