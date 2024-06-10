package com.vivich.starlitreadingapp.ui.screens.lobby.bookDetails

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.vivich.starlitreadingapp.BookDetailsScreen
import com.vivich.starlitreadingapp.R

@Composable
fun BookDetailsScreen(
    navHostController: NavHostController,
    paddingValues: PaddingValues = PaddingValues()
){
    val scrollState = rememberScrollState()
        Box(
            modifier = Modifier
                .background(Color.Black)
                .verticalScroll(scrollState)
                .padding(paddingValues)
                .fillMaxSize()
                .paint(
                    painter = painterResource(id = R.drawable.img_ophelia),
                    contentScale = ContentScale.FillHeight,
                    colorFilter = ColorFilter.tint(Color.hsl(0f, 1F, 0f, 0.85f), BlendMode.SrcAtop)
                ),
            contentAlignment = Alignment.TopStart
        ){
            BIMainBody()
        }

}