package com.example.wazitoecommerce.ui.theme.screens.price

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.example.wazitoecommerce.navigation.PAY_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PriceScreen(navController:NavHostController){
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
            text = "Pay with",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "How would you like to pay?",
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal

        )
        Spacer(modifier = Modifier.height(20.dp))
Row {

    Column {

        Image(
            painter = painterResource(id = R.drawable.img_26),
            contentDescription = "hotel",
            modifier = Modifier
                .size(30.dp)
                .clickable {}

                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


        )

        Spacer(modifier = Modifier.width(30.dp))

    }


    Column {
        Text(
            text = "Credit or Debit card",
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal

        )
    }
        Spacer(modifier = Modifier.width(20.dp))




    Column {
       Button(onClick = { /*TODO*/ }) {
           Text(
               text = "VISA",
               color = Color.Black,
               fontSize = 20.sp,
               fontFamily = FontFamily.SansSerif,
               modifier = Modifier.fillMaxWidth(),
               textAlign = TextAlign.Center,
               fontWeight = FontWeight.ExtraBold

           )
           Spacer(modifier = Modifier.width(10.dp))

       }
    }

    Image(
        painter = painterResource(id = R.drawable.img_26),
        contentDescription = "hotel",
        modifier = Modifier
            .size(30.dp)
            .clip(shape = CircleShape),
        contentScale = ContentScale.Crop


    )
}
        Spacer(modifier = Modifier.height(10.dp))


        Row {

            Column {

                Image(
                    painter = painterResource(id = R.drawable.img_26),
                    contentDescription = "hotel",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(shape = CircleShape)
                        .clickable {
                                                    },
                    contentScale = ContentScale.Crop


                )

                Spacer(modifier = Modifier.width(40.dp))

            }


            Column {
                Text(
                    text = "Pay by Bank",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal

                )
                Spacer(modifier = Modifier.width(40.dp))
            }
        }


        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "Bank",
            color = Color.Black,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Bold

        )

        Spacer(modifier = Modifier.height(20.dp))
Button(onClick = { /*TODO*/ },
    modifier = Modifier.padding(15.dp)) {

    Row {


        Column {
            Text(
                text = "BARCLAYS",
                color = Color.Cyan,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Bold

            )

        }

        Column(modifier = Modifier
            .size(60.dp)
            .padding(10.dp)){
            TopAppBar(
                title = {

                },
                navigationIcon = {
                    IconButton(onClick = {navController.navigate(PAY_URL) }
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.Create,
                            contentDescription = "Menu",
                            tint = Color.Black

                        )
                    }

                },
            )
        }
    }






    Spacer(modifier = Modifier.height(10.dp))

}




        Spacer(modifier = Modifier.height(30.dp))
    Button(
        onClick = {
            navController.navigate(PAY_URL)


        },
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(Color.Black),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
    ) {
        Text(text = "Select")
    }
    Spacer(modifier = Modifier.height(100.dp))






    }
}

@Composable
@Preview(showBackground = true)
fun PriceScreenPreview(){
    WazitoECommerceTheme {
        PriceScreen(navController = rememberNavController())
    }
}
