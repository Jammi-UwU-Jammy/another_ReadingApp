package com.vivich.starlitreadingapp.chapterText

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.FavoriteBorder
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        modifier = Modifier.padding(20.dp, 30.dp),
        title = {
            Column{
                Text(text = "Book Name")
                Text(text = "Chapter Name")
            }
        },
        navigationIcon = {
            Icon(imageVector = Icons.Filled.Clear, contentDescription = "")
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
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