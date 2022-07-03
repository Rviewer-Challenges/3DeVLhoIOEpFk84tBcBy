package com.silvacomp.gamerss.home.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.silvacomp.gamerss.ui.components.GameRSSTopAppBar
import com.silvacomp.gamerss.ui.theme.GameRSSTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameRSSTheme {
               Scaffold(
                   topBar = { GameRSSTopAppBar(title = "Home")}
               ) {

               }
            }
        }
    }
}

