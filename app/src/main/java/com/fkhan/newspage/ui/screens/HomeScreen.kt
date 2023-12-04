package com.fkhan.newspage.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "This is home screen..")
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}