package com.vivich.starlitreadingapp.ui.screens.lobby.home

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.vivich.starlitreadingapp.BottomBarScreens

@Composable
fun BottomBar(
    navHostController: NavHostController = rememberNavController(),
    onHomeClicked: () -> Unit = {},
    onSettingsClicked: () -> Unit = {},
    onProfileClicked: () -> Unit = {},
    currentRoute: String?
){
    NavigationBar(
        modifier = Modifier.background(color = Color.White),
        containerColor = Color.Black,
        contentColor = Color.White
    ){
        NavigationBarItem(
            selected = currentRoute == BottomBarScreens.Settings.route,
            onClick = {onSettingsClicked()},
            icon = {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "")
            }
        )
//        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {
//            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
//        })
        NavigationBarItem(
            selected = currentRoute == BottomBarScreens.Home.route,
            onClick = { onHomeClicked() },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = "")
            }
        )
        NavigationBarItem(
            selected = currentRoute == BottomBarScreens.Profile.route,
            onClick = { onProfileClicked() },
            icon = {
                Icon(imageVector = Icons.Default.Face, contentDescription = "")
            }
        )
    }
}


@Composable
@Preview
fun BottomBarPreview() {
    BottomBar(currentRoute = "")
}