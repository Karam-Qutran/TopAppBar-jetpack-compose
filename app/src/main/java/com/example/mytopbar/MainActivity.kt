package com.example.mytopbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mytopbar.ui.theme.MyTopBarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MytopAppBar()
        }
    }
}

@Composable
fun MytopAppBar() {

    Scaffold(
        topBar ={
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier
                        .fillMaxWidth(),
                    Alignment.Center) {
                        Text(text = "Top App Bar")
                    } },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Menu,
                            contentDescription = "Icon")
                    }
                },
                modifier= Modifier
                    .padding(horizontal = 16.dp, vertical = 10.dp)
                    .clip(shape = RoundedCornerShape(16.dp)),
                backgroundColor = Color(0xFFFEDBD0),
                contentColor = Color(0xFF442c2E),
                elevation = 8.dp,
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = null)
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.ShoppingCart,
                            contentDescription = null)
                    }
                }
            ) 
        }
    ) {
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   MytopAppBar()
}