package com.farhan.tanvir.androidcleanarchitecture.presentation.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
}
