package com.vivich.starlitreadingapp.ui.screens.classic.lobby

import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.vivich.starlitreadingapp.LobbyNavGraph


@Composable
fun LobbyScreen(
    navHostController: NavHostController,
    onHomeClicked: () -> Unit,
    onSettingsClicked: () -> Unit,
    onProfileClicked: () -> Unit
){
    val currentRoute = navHostController.currentBackStackEntryAsState().value?.destination?.route

    Scaffold(
        bottomBar = {
            BottomBar(
                currentRoute = currentRoute,
                navHostController=navHostController,
                onSettingsClicked = onSettingsClicked,
                onProfileClicked = onProfileClicked,
                onHomeClicked = onHomeClicked
            )
        },
        topBar = {
            LobbyTopBar()
        },
        content = {paddingValues->
            LobbyNavGraph(
                paddingValues=paddingValues,
                navController = navHostController
            )
        }
    )
}

