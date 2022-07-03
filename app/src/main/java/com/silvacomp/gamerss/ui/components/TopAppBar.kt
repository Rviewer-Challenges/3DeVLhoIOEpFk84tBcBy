package com.silvacomp.gamerss.ui.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun GameRSSTopAppBar(
    title: String,
) {
    TopAppBar(
        title = {
            Text(text = title)
        }
    )

}