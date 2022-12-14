package com.example.tugasaplikasi

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavRoute.Launcher.name
    ) {
        composable(NavRoute.Launcher.name) {
            Launcher(navController)
        }
        composable(NavRoute.Pilih.name) {
            Pilih(navController)
        }
        composable(NavRoute.Pesan.name) {
            Pesan(navController)
        }
    }
}