package com.vivich.starlitreadingapp.ui.screens.lobby.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vivich.starlitreadingapp.R

@Composable
fun HomeContent(
    paddingValues: PaddingValues
) {
    val scrollState = rememberScrollState()
    Scaffold(
        modifier = Modifier.padding(paddingValues = paddingValues),
        content = {
            Column(
                modifier = Modifier
                    .padding(it)
                    .verticalScroll(scrollState)
            ){
                val bodyModifier = Modifier.padding(10.dp, 15.dp)
                LatestReadTab(modifier = bodyModifier)
                RecommendedTab(modifier = bodyModifier)
                ExploreTab(modifier = bodyModifier)
            }
        }
    )
}

@Composable
fun LatestReadTab(
    modifier:Modifier,
    onBookClicked: () -> Unit = {}
){
    Text(
        modifier = modifier,
        text = "Latest Read", fontSize = 20.sp, fontWeight = FontWeight.Bold
    )

    LazyRow{
        items(3){
            ElevatedCard(
                modifier = Modifier
                    .size(350.dp, 240.dp)
                    .padding(10.dp)
                    .clickable {
                        onBookClicked()
                    }
            ){
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center // Center the Row within the Box
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(15.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp)),
                            painter = painterResource(id = R.drawable.img_ophelia),
                            contentDescription = ""
                        )
                        Column(
                            modifier = Modifier.padding(10.dp, 0.dp)
                        ){
                            Text(text = "Book Name: Very very long name.", modifier=Modifier.padding(0.dp, 10.dp))
                            Text(text = "Author Name")
                            Spacer(modifier = Modifier.padding(20.dp))
                            Text(text = "Free")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ExploreTab(
    modifier:Modifier
){
    Text(
        modifier = modifier,
        text = "Explore", fontSize = 20.sp, fontWeight = FontWeight.Bold
    )

    LazyRow{
        items(8){
            Column {
                ElevatedCard(
                    modifier = modifier
                        .size(180.dp, 270.dp) // preferably 9 x 16
                ){
                    Image(
                        contentScale = ContentScale.FillBounds,
                        painter = painterResource(id = R.drawable.img_ophelia),
                        contentDescription = ""
                    )
                }
                Text(text = "Book Title", modifier=modifier)
            }
        }
    }
}

@Composable
fun RecommendedTab(
    modifier:Modifier
){
    Text(
        modifier = modifier.padding(10.dp, 5.dp),
        text = "Recommended", fontSize = 20.sp, fontWeight = FontWeight.Bold
    )

    LazyRow{
        items(8){
            Column {
                ElevatedCard(
                    modifier = modifier
                        .size(180.dp, 270.dp) // preferably 9 x 16
                ){
                    Image(
                        contentScale = ContentScale.FillBounds,
                        painter = painterResource(id = R.drawable.img_ophelia),
                        contentDescription = ""
                    )
                }
                Text(text = "Book Title", modifier=Modifier.padding(15.dp, 0.dp))
            }
        }
    }
}

@Composable
@Preview
fun MainPreview() {
//    LBMainBody()
}