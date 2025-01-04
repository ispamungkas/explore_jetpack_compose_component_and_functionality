package com.jetpack.explorejetpackcomponentandfunctionality

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.InitialScreen
import com.jetpack.explorejetpackcomponentandfunctionality.presentation.home_screen.HomeScreen
import com.jetpack.explorejetpackcomponentandfunctionality.utils.NavHomeScreen
import com.jetpack.explorejetpackcomponentandfunctionality.utils.NavInitialScreen

@Composable
fun NavigationScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavInitialScreen
    ) {
        composable<NavInitialScreen> {
            InitialScreen()
        }
        composable<NavHomeScreen> {
            HomeScreen()
        }
    }
}