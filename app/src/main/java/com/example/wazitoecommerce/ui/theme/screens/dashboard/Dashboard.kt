@file:Suppress("PreviewMustBeTopLevelFunction")

package com.example.wazitoecommerce.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.LAZYCOLUMN_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LazyColumn1(navController: NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TopAppBar(
            title = {
                Text(
                    text = "Homepage",
                    color = Color.Black,
                )
            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {               navController.navigate(LAZYCOLUMN_URL)
                }
                )
                {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )
                }

            },


            )

        //End of TopAppBar



        Column (modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Card(
                modifier = Modifier
                    .width(400.dp)
                    .height(300.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_12),
                        contentDescription = "Nature",
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.height(30.dp))

                }


            }
            Spacer(modifier = Modifier.height(10.dp))

            var search by remember { mutableStateOf("") }
            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                placeholder = { Text(text = "What's your destination?") },
                leadingIcon = { Image(imageVector = Icons.Default.Search, contentDescription = "") },
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .fillMaxWidth()
            )


            //End of SearchBar
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Recently Viewed",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp)
            )



            Spacer(modifier = Modifier.height(10.dp))


            Row(modifier = Modifier.padding(start = 25.dp)) {
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_15),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Nairobi",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }

                //End of column
                Spacer(modifier = Modifier.width(10.dp))
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_16),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Thika",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }
            }

            Row(modifier = Modifier.padding(start = 25.dp)) {
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_14),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Juja",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }

                //End of column
                Spacer(modifier = Modifier.width(10.dp))
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_17),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Naivasha",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }
            }


            Row(modifier = Modifier.padding(start = 25.dp)) {
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Nakuru",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }

                //End of column
                Spacer(modifier = Modifier.width(10.dp))
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_21
                            ),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Mombasa",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }
            }






            Row(modifier = Modifier.padding(start = 25.dp)) {
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Thika",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }

                //End of column
                Spacer(modifier = Modifier.width(10.dp))
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_20),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Juja",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }
            }


            Row(modifier = Modifier.padding(start = 25.dp)) {
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_18),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Eldoret",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }

                //End of column
                Spacer(modifier = Modifier.width(10.dp))
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_9),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Kisumu",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }
            }



            Row(modifier = Modifier.padding(start = 25.dp)) {
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ho2),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Nairobi",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }

                //End of column
                Spacer(modifier = Modifier.width(10.dp))
                //Column one
                Column {
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(100.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_2),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )


                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Mombasa",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                }
            }




        }
        }
    }



@Composable
@Preview(showBackground = true)
fun LazyColumn1Preview(){
    WazitoECommerceTheme {
        LazyColumn1(navController = rememberNavController())
    }
}