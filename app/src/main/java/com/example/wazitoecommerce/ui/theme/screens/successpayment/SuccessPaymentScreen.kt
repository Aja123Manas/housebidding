package com.example.wazitoecommerce.ui.theme.screens.successpayment

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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ADD_HOUSES_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun SuccessScreen(navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(100.dp))

        Image(
            painter = painterResource(id = R.drawable.img_25),
            contentDescription = "flower",
            modifier = Modifier
                .size(200.dp)

        )


        Spacer(modifier = Modifier.height(200.dp))




        Text(
            text = "Payment",
            color = Color.Black,
            fontSize = 35.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Successful!",
            color = Color.Black,
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(80.dp))




        Button(onClick = {

            navController.navigate(ADD_HOUSES_URL)

        },
            shape = RoundedCornerShape(35.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Done")
        }
        Spacer(modifier = Modifier.height(20.dp))




    }
}

@Composable
@Preview(showBackground = true)
fun SuccessScreenPreview(){
    WazitoECommerceTheme {
        SuccessScreen(navController = rememberNavController())
    }
}