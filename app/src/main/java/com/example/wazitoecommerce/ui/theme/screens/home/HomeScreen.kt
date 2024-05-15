package com.example.wazitoecommerce.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
@Composable
fun HomeScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Image(
            painter = painterResource(id = R.drawable.img_46),
            contentDescription = "flower",
            modifier = Modifier
                .size(200.dp)

        )


        Spacer(modifier = Modifier.height(200.dp))
        Button(onClick = {navController.navigate(LOGIN_URL)


        },
            shape = RoundedCornerShape(45.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(SIGNUP_URL)


        },
            shape = RoundedCornerShape(45.dp),
            colors = ButtonDefaults.buttonColors(Color.Cyan),


            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)


        ) {
            Text(text = "Sign Up",
            )
        }

        Spacer(modifier = Modifier.height(40.dp))




    }
}

@Composable
@Preview(showBackground = true)
fun HomePreview(){
    WazitoECommerceTheme {


        HomeScreen(navController = rememberNavController())
    }
}