package com.vivich.starlitreadingapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Routes(val route: String){
    data object Login: Routes("login")
    data object Lobby: Routes("lobby")
}

object Graph{
    const val ROOT = "root_graph"
    const val AUTH = "auth_graph"
    const val LOBBY = "lobby_graph"
    const val BOOK_DETAILS = "book_details_graph"
}

sealed class AuthScreen(val route: String){
    data object  Login : AuthScreen(route = "LOGIN")
    data object  SignUp : AuthScreen(route = "SIGN_UP")
}

sealed class BottomBarScreens(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    data object Home : BottomBarScreens(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home
    )
    data object Settings : BottomBarScreens(
        route = "Settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
    data object Profile : BottomBarScreens(
        route = "PROFILE",
        title = "PROFILE",
        icon = Icons.Default.AccountCircle
    )
}

sealed class BookDetailsScreen(val route: String){
    data object  Details : BookDetailsScreen(route = "DETAILS")
    data object  Overview : BookDetailsScreen(route = "OVERVIEW")
    data object  Relevant : BookDetailsScreen(route = "RELEVANT")
}

@Composable
fun ScreenContent(
    title: String,
    onClick: () -> Unit
) {
    Scaffold {
        Column(
            modifier = Modifier.padding(it)
        ){
            Text(text = title)
        }
    }
}