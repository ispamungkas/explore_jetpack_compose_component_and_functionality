package com.jetpack.explorejetpackcomponentandfunctionality

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
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
    val currentContext = LocalContext.current

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = NavInitialScreen
    ) {
        composable<NavInitialScreen> {
            InitialScreen(
                navigateToRegister = {
                    Toast.makeText(currentContext, "Under Development", Toast.LENGTH_SHORT).show()
                },
                navigateToLogin = {
                    navController.navigate(NavHomeScreen)
                }
            )
        }
        composable<NavHomeScreen> {
            HomeScreen()
        }
    }
}