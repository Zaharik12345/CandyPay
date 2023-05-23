package com.zakdroid.candypay.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.zakdroid.candypay.design.base.widget.bottombar.BottomBarTabs
import com.zakdroid.candypay.features.auth.ui.LoginScreen
import com.zakdroid.candypay.features.splash.SplashScreen

fun NavGraphBuilder.splash(
    navController: NavController
){
    composable(NavigationRoutes.Splash.route){
        SplashScreen(navController)
    }
}

fun NavGraphBuilder.login(
    navController: NavController
){
    navigation(
        startDestination = NavigationRoutes.Login.route,
        route = NavigationRoutes.LoginGraph.route
    ){
        composable(NavigationRoutes.Login.route){
            LoginScreen(navController)
        }
    }
}

fun NavGraphBuilder.mainGraph(
    navController: NavController
){
    navigation(
        startDestination = BottomBarTabs.Main.route,
        route = NavigationRoutes.MainGraph.route
    ){

    }
}