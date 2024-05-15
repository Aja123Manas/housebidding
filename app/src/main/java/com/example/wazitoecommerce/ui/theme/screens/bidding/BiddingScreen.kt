package com.example.wazitoecommerce.ui.theme.screens.bidding

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.PRICE_URL
import com.example.wazitoecommerce.navigation.USER_URL



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LazyColumn2(navController: NavHostController) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

//TopAppBar
        TopAppBar(
            title = {
                Text(
                    text = "Bidding",
                    modifier = Modifier.padding(start = 80.dp),
                    color = Color.Black

                )
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(USER_URL)

                }
                )
                {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Arrow Back",
                        tint = Color.Black
                    )
                }

            },





            )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),


            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp, end = 0.dp)

        ) {
            Text(text = " 15 Seconds Remaining for Bidding")
        }
        //End Of TopAppBar

        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(id = R.drawable.img_7),
            contentDescription = "flower",
            modifier = Modifier
                .size(50.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Ksh.120,000",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Gray,
            modifier = Modifier.padding(start = 40.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Current Bidding Price",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
            modifier = Modifier.padding(start = 20.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))


        Card(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp)

        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.img_9),
                    contentDescription = "Dubai",
                    modifier = Modifier
                        .size(width = 200.dp, height = 200.dp)
                        .padding(15.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Spacer(modifier = Modifier.height(25.dp))

                    Text(text = "Ksh.200000", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text = "An Estate for sale. Bigger Group? Get special offers upto 50% off! ...")
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Bid Or Buy and have a home!!!",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 30.dp)

                    )

                }

            }
        }
        Spacer(modifier = Modifier.height(10.dp))



        Text(
            text = "Bid Positions (30 Bidding)",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
            modifier = Modifier.padding(start = 70.dp)

        )

        Spacer(modifier = Modifier.height(10.dp))




        Row(
            Modifier.fillMaxWidth(),
        ) {
            Column {


                Text(
                    text = "01",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 40.dp)

                )
                Spacer(modifier = Modifier.height(15.dp))


                Text(
                    text = "02",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 40.dp)

                )

                Spacer(modifier = Modifier.height(15.dp))


                Text(
                    text = "03",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 40.dp)

                )

            }
            Spacer(modifier = Modifier.height(15.dp))

            Spacer(modifier = Modifier.width(50.dp))




            Column {


                Text(
                    text = "John Doe",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 20.dp)

                )
                Spacer(modifier = Modifier.height(15.dp))


                Text(
                    text = "Christina Matew",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 20.dp)

                )

                Spacer(modifier = Modifier.height(15.dp))


                Text(
                    text = "Rogger Federal",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 20.dp)

                )

            }
            Spacer(modifier = Modifier.height(15.dp))

            Spacer(modifier = Modifier.width(35.dp))


            Column {


                Text(
                    text = "Ksh.100000",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 2.dp)

                )
                Spacer(modifier = Modifier.height(15.dp))


                Text(
                    text = "Ksh.150000",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 2.dp)

                )

                Spacer(modifier = Modifier.height(15.dp))


                Text(
                    text = "Ksh.200000",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 2.dp)

                )

            }
        }
        Spacer(modifier = Modifier.height(15.dp))

        Card(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()

        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.img_11),
                    contentDescription = "hotel",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop


                )


                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "YOU", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    Text(text = "Ksh.90000",
                        )
                    Spacer(modifier = Modifier.height(10.dp))


                }
                Spacer(modifier = Modifier.width(50.dp))
Column(modifier = Modifier.padding(start = 120.dp)) {
    TopAppBar(
        title = {

        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
        navigationIcon = {
            IconButton(onClick = {                      }
            )
            {
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "Menu",
                    tint = Color.Black
                )
            }

        },
    )
}
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(modifier = Modifier.padding(start = 15.dp, end = 15.dp)) {
            Column {
                Card(
                    modifier = Modifier
                        .width(156.dp)
                        .height(50.dp)
                ) {
                    Button(
                        onClick = {

                        },
                        shape = RoundedCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                    ) {
                        Text(text = "-",
                            modifier=Modifier.clickable {    navController.navigate(PRICE_URL)
                            })
                    }



                }

                Spacer(modifier = Modifier.width(50.dp))


            }

            //End of column
            Spacer(modifier = Modifier.width(10.dp))
            Spacer(modifier = Modifier.height(20.dp))


            Text(text = "05",
                fontWeight = FontWeight.Black,
                modifier = Modifier.padding(10.dp)
                    )
            Spacer(modifier = Modifier.width(10.dp))


            //Column one
            Column {
                Card(
                    modifier = Modifier
                        .width(156.dp)
                        .height(50.dp)
                ) {
                    Button(
                        onClick = {

                        },
                        shape = RoundedCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, end = 30.dp)
                    ) {
                        Text(text = "+",
                            modifier=Modifier.clickable {    navController.navigate(PRICE_URL)
                            })
                    }



                }

                Spacer(modifier = Modifier.width(50.dp))


            }

        }

    }
}










@Preview(showBackground = true)
@Composable
fun LazyColumn2Preview(){
    LazyColumn2(navController = rememberNavController())

}
