package com.juma.locallist.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.juma.locallist.ui.BrandDetailScreen
import com.juma.locallist.ui.HomeScreen

@Composable
fun MyNavHost(
    navHost: NavHostController
) {
    NavHost(navController = navHost, startDestination = Routes.Home.routes) {

        composable(
            route = Routes.Home.routes,
        ) {
            HomeScreen(navHost)
        }

        composable(Routes.Details.routes+"/{brandItem}") {
            BrandDetailScreen(navHost)
        }
    }
}