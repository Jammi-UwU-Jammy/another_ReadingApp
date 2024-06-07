package com.vivich.starlitreadingapp.ui.screens.classic.lobby

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun BottomBar(
    navHostController: NavHostController? = null
){
    NavigationBar(
        containerColor = Color.LightGray,
        contentColor = Color.Black
    ){
        NavigationBarItem(selected = true, onClick = {}, icon = {
            Icon(imageVector = Icons.Default.Settings, contentDescription = "")
        })
        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
        })
        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(imageVector = Icons.Default.Home, contentDescription = "")
        })
        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
        })
    }
}


@Composable
@Preview
fun BottomBarPrievew() {
    BottomBar()
}