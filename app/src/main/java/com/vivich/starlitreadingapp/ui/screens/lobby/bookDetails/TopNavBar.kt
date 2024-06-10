package com.vivich.starlitreadingapp.ui.screens.lobby.bookDetails

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BITopBar(
    navController: NavHostController = rememberNavController(),
    onReturnClicked : () -> Unit = {}
) {
    CenterAlignedTopAppBar(
        title = { Text(text = "Book Detail") },
        navigationIcon = {
            IconButton(onClick = { onReturnClicked() }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "")
            }
        }
    )


}

@Composable
@Preview
fun BDTopBarPreview() {
    BITopBar()
}