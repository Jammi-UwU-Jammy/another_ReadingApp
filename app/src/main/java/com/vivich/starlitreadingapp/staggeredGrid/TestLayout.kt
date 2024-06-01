package com.vivich.starlitreadingapp.staggeredGrid

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vivich.starlitreadingapp.R
import kotlin.random.Random


@Composable
fun StaggeredGridTest() {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(3),
        verticalItemSpacing = 10.dp,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        content = {
            items(4) {
                Image(
                    painter = painterResource(id = R.drawable.img_ophelia),
                    modifier = Modifier
                        .fillMaxWidth(.3f)
//                        .fillMaxWidth((0.3f + Math.random() * .1f).toFloat())
                        .wrapContentHeight(),
                    contentDescription = null,
                )
            }
        },
    )
}

@Composable
@Preview
fun TestPreview() {
    Scaffold{
        Box(
            modifier = Modifier.padding(it).fillMaxSize()
        ){
            StaggeredGridTest()
        }
    }
}