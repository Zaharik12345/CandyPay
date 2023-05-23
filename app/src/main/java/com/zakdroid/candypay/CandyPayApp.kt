package com.zakdroid.candypay

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.core.tween
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import kotlinx.coroutines.ExperimentalCoroutinesApi
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.zakdroid.candypay.navigation.NavigationRoutes
import com.zakdroid.candypay.navigation.login
import com.zakdroid.candypay.navigation.mainGraph
import com.zakdroid.candypay.navigation.splash

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalAnimationApi
@ExperimentalCoroutinesApi

@Composable
fun CandyPayApp(
    navController: NavHostController
){
    Scaffold() {innerPadding ->
        AnimatedNavHost(
            navController = navController,
            startDestination = NavigationRoutes.Splash.route,
            modifier = Modifier.padding(innerPadding),
            enterTransition = { fadeIn(animationSpec = tween(300)) },
            exitTransition = { fadeOut(animationSpec = tween(300)) }
            ){
            splash(navController)
            login(navController)
            mainGraph(navController)
        }
    }
}