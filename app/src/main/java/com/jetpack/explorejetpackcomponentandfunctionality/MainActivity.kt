package com.jetpack.explorejetpackcomponentandfunctionality

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jetpack.explorejetpackcomponentandfunctionality.ui.theme.ExploreJetpackComponentAndFunctionalityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExploreJetpackComponentAndFunctionalityTheme {
                NavigationScreen()
            }
        }
    }
}