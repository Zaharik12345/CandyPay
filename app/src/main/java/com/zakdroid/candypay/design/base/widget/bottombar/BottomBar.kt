package com.zakdroid.candypay.design.base.widget.bottombar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

val bottomBarTabs = listOf(
    BottomBarTabs.Main,
    BottomBarTabs.Profile
)

@Composable
fun BottomBar(
    navController: NavController = rememberNavController(),
    tabs: List<BottomBarTabs> = bottomBarTabs,
) {
    NavigationBar(
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        tabs.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(painter = painterResource(id = item.icon), contentDescription = "")
                },
                label = {
                    Text(
                        text = stringResource(id = item.title)
                    )
                },
                selected = currentRoute == item.route,
                onClick = {
                    if (currentRoute != item.route)
                        navController.navigate(item.route)
                }
            )
            
        }
    }
}