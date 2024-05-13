package com.example.bookinguru.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.bookinguru.ui.theme.screens.company.AddCompanyScreen
import com.example.bookinguru.ui.theme.screens.first.CardScreen
import com.example.bookinguru.ui.theme.screens.home.HomeScreen
import com.example.bookinguru.ui.theme.screens.imm.SecondLanding
import com.example.bookinguru.ui.theme.screens.immediate.LandingScreen
import com.example.bookinguru.ui.theme.screens.login.LoginScreen
import com.example.bookinguru.ui.theme.screens.profiles.ProfilesScreen
import com.example.bookinguru.ui.theme.screens.signup.SignupScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = LANDING_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController) }

        composable(home_URL){
            HomeScreen(navController = navController)

        }

        composable(ADDCOMPANY_URL){
            AddCompanyScreen(navController = navController)

        }

        composable(LANDING_URL){
            LandingScreen(navController = navController)
        }
        composable(First_URL){
            CardScreen(navController = navController)
        }

        composable(SECOND_LANDING_URL){
            SecondLanding(navController = navController)
        }
         composable(Profiles_URL){
            ProfilesScreen(navController = navController)
        }


    }
}