package com.vivich.starlitreadingapp.ui.screens.classic.lobby

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.vivich.starlitreadingapp.Graph
import com.vivich.starlitreadingapp.bookDetailsGraph


@Composable
fun LobbyScreen(
    navHostController: NavHostController
) {
    Scaffold(
        bottomBar = {
            BottomBar()
        }
    ){
        Text(text = "", modifier = Modifier.padding(it))
        LobbyNavGraph(navController=navHostController)
    }
}


@Composable
fun LobbyNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        route= Graph.LOBBY,
        startDestination = ""
    ){
        composable(route = ""){
            //lobby
        }
        composable(route = ""){
            // profile etc.
        }
        bookDetailsGraph(navController)
    }
}