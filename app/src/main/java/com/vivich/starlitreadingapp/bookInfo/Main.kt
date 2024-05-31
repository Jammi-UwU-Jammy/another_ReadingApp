package com.vivich.starlitreadingapp.bookInfo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vivich.starlitreadingapp.R

@Composable
fun BIMain() {
    Scaffold(
        topBar = { BITopBar() },
        bottomBar = { BIBottomBar() },
        content = {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                BIMainBody()
            }
        }
    )
}

@Composable
fun BIMainBody() {
    BookCoverImage()
    BIBookDescription()
}


@Composable
fun BIBookDescription() {
    Column(
        modifier = Modifier
            .padding(0.dp, 20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(text = "Book Name", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text(text = "Author: Name")
        }
        Row(
            Modifier
                .padding(10.dp, 20.dp)
                .fillMaxWidth()
                .border(BorderStroke(2.dp, color = Color.LightGray), CircleShape)
        ){
            Column(
                modifier = Modifier
                    .weight(1.0f)
                    .padding(0.dp, 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Released")
                Text(text = "2024")
            }
            Column(
                modifier = Modifier
                    .weight(1.0f)
                    .padding(0.dp, 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Chapters")
                Text(text = "20")
            }
            Column(
                modifier = Modifier
                    .weight(1.0f)
                    .padding(0.dp, 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Review")
                Text(text = "21")
            }
            Column(
                modifier = Modifier
                    .weight(1.0f)
                    .padding(0.dp, 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Rating")
                Text(text = "3.7")
            }
        }

    }
}

@Composable
fun BookCoverImage() {
    ElevatedCard(
        modifier = Modifier.size(220.dp, 360.dp),
        onClick = { /*TODO*/ }
    ){
        Image(
            painter = painterResource(id = R.drawable.img_ophelia),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
@Preview
fun BIMainPreview() {
    BIMain()
}