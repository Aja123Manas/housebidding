package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.bidding.LazyColumn2
import com.example.wazitoecommerce.ui.theme.screens.dashboard.LazyColumn1
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.house.AddHousesScreen
import com.example.wazitoecommerce.ui.theme.screens.house.ViewHousesScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.message.MessageScreen
import com.example.wazitoecommerce.ui.theme.screens.pay.PayScreen
import com.example.wazitoecommerce.ui.theme.screens.price.PriceScreen
import com.example.wazitoecommerce.ui.theme.screens.property.LazyColumn
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.Splash
import com.example.wazitoecommerce.ui.theme.screens.successpayment.SuccessScreen
import com.example.wazitoecommerce.ui.theme.screens.userprofile.User

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController=navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }

        composable(PRICE_URL){
            PriceScreen(navController = navController)
        }

        composable(LAZYCOLUMN1_URL){
            LazyColumn1(navController = navController)
        }
        composable(PAY_URL){
            PayScreen(navController = navController)
        }

        composable(LAZYCOLUMN2_URL){
            LazyColumn2(navController = navController)

        }



        composable(MESSAGE_URL){
            MessageScreen (navController = navController)
        }

        composable(LAZYCOLUMN_URL){
            LazyColumn (navController = navController)
        }
        composable(SUCCESS_URL){
            SuccessScreen (navController = navController)
        }
        composable(USER_URL){
            User( navController = navController)

        }



        composable(SPLASH_URL){
            Splash (navController =navController)
        }



        composable(ADD_HOUSES_URL){
            AddHousesScreen(navController = navController)
        }
        composable(VIEW_HOUSES_URL){
            ViewHousesScreen(navController = navController)
        }
    }
}