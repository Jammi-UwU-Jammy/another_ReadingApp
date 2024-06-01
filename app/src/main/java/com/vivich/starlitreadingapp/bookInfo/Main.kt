package com.vivich.starlitreadingapp.bookInfo

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CardColors
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vivich.starlitreadingapp.R

@Composable
fun BIMain() {

    val scrollState = rememberScrollState()

    Scaffold(
        topBar = { BITopBar() },
        bottomBar = { BIBottomBar() },
        content = {
            Column(
                modifier = Modifier
                    .verticalScroll(scrollState)
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
    BookDescription()
}


@Composable
fun BookDescription() {
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
        BookOverview()
        BookDetails()
    }
}

@Composable
fun BookDetails() {
    Row(
        Modifier
            .fillMaxWidth(0.8f)
    ){
        val modifier = Modifier.weight(1f)
        val textAlign = TextAlign.Center
        var showDivider by remember { mutableStateOf(0) }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.clickable {
                showDivider = 0
            }
        ){
            Text(text = "Details", textAlign = textAlign)
            if (showDivider == 0)
                HorizontalDivider(color = Color.DarkGray, thickness = 3.dp)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.clickable {
                showDivider = 1
            }
        ){
            Text(text = "Author",  textAlign = textAlign)
            if (showDivider == 1)
                HorizontalDivider(color = Color.DarkGray, thickness = 3.dp)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.clickable {
                showDivider = 2
            }
        ){
            Text(text = "Review",  textAlign = textAlign)
            if (showDivider == 2)
                HorizontalDivider(color = Color.DarkGray, thickness = 3.dp)
        }
    }
    ElevatedCard(
        onClick = { /*TODO*/ },
        modifier = Modifier.fillMaxSize(),
        colors = CardColors(
            Color.White,
            Color.DarkGray,
            Color.Unspecified,
            Color.Unspecified
        )
    ){
        Text(
            modifier = Modifier.padding(20.dp),
            text = stringResource(id = R.string.Book_text_placeholder)
        )
    }
}

@Composable
fun BookOverview() {
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