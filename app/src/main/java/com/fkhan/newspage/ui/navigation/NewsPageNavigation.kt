package com.fkhan.newspage.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fkhan.newspage.ui.screens.HomeScreen

@Composable
fun NewsPageNavigationGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.HOME_SCREEN) {

        composable(route = Routes.HOME_SCREEN) {
            HomeScreen()
        }
    }
}
