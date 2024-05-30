package com.vivich.starlitreadingapp.bookInfo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = { /*TODO*/ },
        navigationIcon = {
            Icon(imageVector = Icons.Filled.Clear, contentDescription = "")
        },
        actions = {
            Icon(imageVector = Icons.Filled.Share, contentDescription = "")
            Icon(imageVector = Icons.Filled.FavoriteBorder, contentDescription = "")
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