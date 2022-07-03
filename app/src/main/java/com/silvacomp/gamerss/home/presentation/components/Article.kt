package com.silvacomp.gamerss.home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Article(
    title: String,
    author: String,
    time: String,
    image: String,
    viewDetail: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .clickable { viewDetail() }
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Column(
                modifier = Modifier.weight(2f)
            ) {
                Text(text = title, fontWeight = FontWeight.Bold)
                Text(text = "askdjfkdasjfkljoierie mjvposdfdsfldsjfdlsk")
            }
            Box(modifier = Modifier.background(Color.Red).weight(1f))
            

        }

    }

}

@Preview
@Composable
fun ArticlePrev() {
    Article(
        title = "Lorem impsum dolor",
        author = "Jose silva",
        time = "1 sem",
        image = "no url"
    ) {

    }
}