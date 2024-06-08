package com.vivich.starlitreadingapp.ui.screens.lobby.bookContent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        modifier = Modifier.padding(20.dp, 20.dp),
        title = {
            Column(
                modifier = Modifier.padding(20.dp, 0.dp)
            ){
                Text(text = "Book Name", color = Color.Black)
                Text(text = "Chapter Name", fontSize = 15.sp)
            }
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.KeyboardArrowDown, contentDescription = "")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.FavoriteBorder, contentDescription = "")
            }
        },
        colors = TopAppBarColors(
            Color.Transparent,
            Color.Transparent,
            Color.Black,
            Color.LightGray,
            Color.Black
        )
    )
}


@Composable
@Preview
fun TopBarPreview() {
    TopBar()
}