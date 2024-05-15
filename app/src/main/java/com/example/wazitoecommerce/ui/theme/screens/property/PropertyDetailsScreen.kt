@file:Suppress("PreviewMustBeTopLevelFunction")

package com.example.wazitoecommerce.ui.theme.screens.property

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
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
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
import com.example.wazitoecommerce.navigation.LAZYCOLUMN1_URL
import com.example.wazitoecommerce.navigation.MESSAGE_URL
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LazyColumn(navController: NavHostController){
    Column (modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        TopAppBar(
            title = {
               },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {  navController.navigate(LAZYCOLUMN1_URL)
                }
                )
                {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = "Menu",
                        tint = Color.Black
                    )
                }

                             },

            actions = {


                IconButton(onClick = {                     navController.navigate(MESSAGE_URL)
                }) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "Share",
                        tint = Color.Black
                    )
                }




            }



        )


        Card (
            modifier = Modifier
                .width(350.dp)
                .height(200.dp)
                .padding(start =15.dp )

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_28),
                    contentDescription = "Nature",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = "WELCOME TO PROPERTY FINDER",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )

            }


        }


        Text(
            text = "Buy or Rent",
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding(20.dp)
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_29),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Kileleshwa",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_30),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Runda",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_31),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Juja",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_32),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Yaya",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_33),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Juja",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_34),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Westlands",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_35),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Kilimani",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_36),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Juja",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_37),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Yaya",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_38),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Syokimau",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_39),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Runda",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_40),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Westlands",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_41),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Karen",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_42),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Juja",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_43),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Lavington",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_44),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Kilimani",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_45),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Westlands",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_46),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Runda",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_40),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Syokimau",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_28),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Kileleshwa",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_35),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Westlands",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_45),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Juja",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_44),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Lavington",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_37),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Karen",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_29),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Runda",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_36),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Yaya",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_45),
                            contentDescription = "Dubai",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Kilimani",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1500 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
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
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_40),
                            contentDescription = "Mt.Kenya",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite",
                            tint = Color.White,
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(15.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "Kileleshwa",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.ExtraBold,
                )

                Spacer(modifier = Modifier.height(2.dp))
                Row {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Magenta
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))

                Text(
                    text = "1000 Reviews",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                )

                Spacer(modifier = Modifier.height(2.dp))


                Text(
                    text = "From Ksh.500000",
                    fontFamily = FontFamily.Serif,
                    fontSize = 15.sp,
                    color = Color.Blue
                )

                Spacer(modifier = Modifier.height(2.dp))


            }
        }




        //End of column

        Spacer(modifier = Modifier.width(10.dp))

    }





}



@Composable
@Preview(showBackground = true)
fun LazyColumnPreview(){
    WazitoECommerceTheme {
        LazyColumn(navController = rememberNavController())
    }
}