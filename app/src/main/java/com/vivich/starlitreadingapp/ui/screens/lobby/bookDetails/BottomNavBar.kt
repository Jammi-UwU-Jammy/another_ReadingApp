package com.vivich.starlitreadingapp.ui.screens.lobby.bookDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vivich.starlitreadingapp.BookContentScreen

@Composable
fun BIBottomBar(
    navHostController: NavHostController = rememberNavController()
) {
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth(),
        containerColor = Color.Transparent
    ){
        NavigationBarItem(selected = false,
            modifier = Modifier
                .padding(20.dp, 20.dp)
                .background(Color.Black),
            onClick = {navHostController.navigate(BookContentScreen.Content.route)},
            icon = { Text(text = "Start Reading", color = Color.White) }
        )
    }
}


@Composable
@Preview
fun BIBottomBarPreview() {
    BIBottomBar()
}