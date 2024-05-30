package com.vivich.starlitreadingapp.lobby

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainBody(){

    val scrollState = rememberScrollState()
    Scaffold(
        modifier = Modifier.fillMaxHeight(),
        topBar = { TopBar() },
        bottomBar = { BottomBar() },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .verticalScroll(scrollState)
            ){
                CurrentBookTab(modifier = Modifier)
                MostPopularTab()
                RecommendedTab()
            }
        }
    )
}


@Composable
fun CurrentBookTab(
    modifier:Modifier
){
    Text(text = "Latest Read", fontSize = 20.sp)

    LazyRow{
        items(3){
            ElevatedCard(
                modifier = Modifier
                    .size(300.dp, 240.dp)
                    .padding(10.dp)
            ){
                Text(text = "Card")
            }
        }
    }
}

@Composable
fun MostPopularTab(){
    Text(text = "Popular", fontSize = 20.sp)

    LazyRow{
        items(8){
            ElevatedCard(
                modifier = Modifier
                    .size(150.dp, 270.dp) // preferably 9 x 16
                    .padding(10.dp)
            ){
                Text(text = "Card")
            }
        }
    }
}

@Composable
fun RecommendedTab(){
    Text(text = "Recommended", fontSize = 20.sp)

    LazyRow{
        items(8){
            ElevatedCard(
                modifier = Modifier
                    .size(150.dp, 270.dp) // preferably 9 x 16
                    .padding(10.dp)
            ){
                Text(text = "Card")
            }
        }
    }
}

@Composable
@Preview
fun MainPreview() {
    MainBody()
}