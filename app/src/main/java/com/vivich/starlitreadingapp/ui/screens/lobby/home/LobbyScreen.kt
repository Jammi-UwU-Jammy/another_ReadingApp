package com.vivich.starlitreadingapp.ui.screens.lobby.home

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.vivich.starlitreadingapp.BookDetailsScreen
import com.vivich.starlitreadingapp.BottomBarScreens
import com.vivich.starlitreadingapp.LobbyNavGraph
import com.vivich.starlitreadingapp.ui.screens.lobby.bookDetails.BIBottomBar
import com.vivich.starlitreadingapp.ui.screens.lobby.bookDetails.BITopBar


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
            when (currentRoute){
                BookDetailsScreen.Details.route ->
                    BIBottomBar()

//                BottomBarScreens.Home.route ->
                else ->
                    BottomBar(
                        currentRoute = currentRoute,
                        navHostController=navHostController,
                        onSettingsClicked = onSettingsClicked,
                        onProfileClicked = onProfileClicked,
                        onHomeClicked = onHomeClicked
                    )
            }

        },
        topBar = {
            when (currentRoute){
                BookDetailsScreen.Details.route -> BITopBar()
                BottomBarScreens.Home.route -> LobbyTopBar()
                else ->  {}
            }
        },
        content = {paddingValues->
            LobbyNavGraph(
                paddingValues=paddingValues,
                navController = navHostController
            )
        }
    )
}

