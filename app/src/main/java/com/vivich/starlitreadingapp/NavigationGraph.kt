package com.vivich.starlitreadingapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.vivich.starlitreadingapp.ui.screens.auth.AuthenticationScreen
import com.vivich.starlitreadingapp.ui.screens.auth.SignUpScreen
import com.vivich.starlitreadingapp.ui.screens.lobby.home.HomeContent
import com.vivich.starlitreadingapp.ui.screens.lobby.home.LobbyScreen


@Composable
fun RootGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ){
        authGraph(navController=navController)
        composable(route = Graph.LOBBY){
            val lobbyController = rememberNavController()
            LobbyScreen(
                navHostController = lobbyController,
                onHomeClicked = { lobbyController.navigate(BottomBarScreens.Home.route) },
                onSettingsClicked = { lobbyController.navigate(BottomBarScreens.Settings.route) },
                onProfileClicked = { lobbyController.navigate(BottomBarScreens.Profile.route)}
            )
        }
    }
}


fun NavGraphBuilder.authGraph(
    navController: NavController
) {
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ){
        composable(route = AuthScreen.Login.route){
            AuthenticationScreen(
                onLogInClick = {
//                    navController.popBackStack()
                    navController.navigate(Graph.LOBBY)
                },
                onSignUpClick = {
                    navController.navigate(AuthScreen.SignUp.route)
                }
            )
        }
        composable(route = AuthScreen.SignUp.route){
            SignUpScreen()
        }
    }
}


@Composable
fun LobbyNavGraph(
    navController: NavHostController,
    paddingValues: PaddingValues
){
    NavHost(
        navController = navController,
        startDestination = BottomBarScreens.Home.route
    ){

        composable(route = BottomBarScreens.Home.route){
            HomeContent(paddingValues)
        }
        composable(route = BottomBarScreens.Settings.route){
            ScreenContent(title = "Lobby/Settings") {
                // /TODO: To implemented
            }
        }
        composable(route = BottomBarScreens.Profile.route){
            ScreenContent(title = "Lobby/Profile") {
                // /TODO: To implemented
            }
        }
        composable(route = BookDetailsScreen.Details.route){

        }

    }
}


//fun NavGraphBuilder.bookDetailsGraph(
//    navController: NavHostController
//){
//    navigation(
//        route = Graph.BOOK_DETAILS,
//        startDestination = BookDetailsScreen.Information.route
//    ){
//        composable(route = BookDetailsScreen.Information.route){
//
//        }
//        composable(route = BookDetailsScreen.Overview.route){
//
//        }
//    }
//}