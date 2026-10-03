package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {

    val bayanganTeks = Shadow(
        color = Color.Black,
        offset = Offset(2f, 2f),
        blurRadius = 6f
    )

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = "Gambar Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 55.dp,
                    bottom = 35.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Login",
                    style = TextStyle(
                        fontSize = 40.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Blue,
                        shadow = bayanganTeks
                    )
                )

                Spacer(
                    modifier = Modifier.height(4.dp)
                )

                Text(
                    text = "Ini adalah halaman login",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        shadow = bayanganTeks
                    )
                )
            }

            Spacer(
                modifier = Modifier.height(35.dp)
            )
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(125.dp)
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )


        }
    }
}