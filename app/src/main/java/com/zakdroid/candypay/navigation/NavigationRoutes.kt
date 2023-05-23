package com.zakdroid.candypay.navigation

sealed class NavigationRoutes(val route: String) {

    //Graphs
    object MainGraph: NavigationRoutes("main_graph")

    //Splash
    object Splash: NavigationRoutes("splash_route")

    //Login
    object Login: NavigationRoutes("login_route")
    object LoginGraph: NavigationRoutes("login_graph")

}