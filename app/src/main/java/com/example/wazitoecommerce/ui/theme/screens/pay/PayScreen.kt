package com.example.wazitoecommerce.ui.theme.screens.pay

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.wazitoecommerce.navigation.SUCCESS_URL

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PayScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Ksh.2000000",
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Goods and Services",
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal

        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Ref.5723687998",
            color = Color.Gray,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal

        )

        Spacer(modifier = Modifier.height(5.dp))


        Text(
            text = "Pay with card",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Account Type",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif
        )

        Spacer(modifier = Modifier.height(30.dp))
        var lastname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }


        TextField(
            value = lastname,
            onValueChange = { lastname = it },
            placeholder = { Text(text = "Personal") },
            leadingIcon = { Icon(imageVector = Icons.Default.Star, contentDescription = "") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(30.dp))


        TextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "Business") },
            leadingIcon = { Icon(imageVector = Icons.Default.Star, contentDescription = "") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )





        Spacer(modifier = Modifier.height(30.dp))


        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = {
                navController.navigate(SUCCESS_URL)


            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Pay")
        }
        Spacer(modifier = Modifier.height(50.dp))






    }
}

@Composable
@Preview(showBackground = true)
fun PayScreenPreview(){
    WazitoECommerceTheme {
        PayScreen(navController = rememberNavController())
    }
}
