package com.juma.locallist.ui.navigation

sealed class Routes (val routes: String){
    object Home: Routes(routes = "Home")

    object Details: Routes(routes = "Details")
}
