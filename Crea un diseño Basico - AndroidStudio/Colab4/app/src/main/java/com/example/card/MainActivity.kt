package com.example.card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.card.ui.theme.CardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Card()
                }
            }
        }
    }
}

@Composable
fun Card(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD5F0B5))

    ){
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(
                modifier = Modifier
                    .background(Color(0xFF171C85))
            ){
                val image = painterResource(R.drawable.android_logo)
                Image(painter = image, contentDescription = null, Modifier.size(105.dp))
            }
            Text(
                text = stringResource(R.string.name),
                modifier = Modifier.padding(top = 15.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 35.sp,
                fontFamily = FontFamily.Default

            )
            Text(
                text = stringResource(R.string.job),
                color = Color(0xFF056406),
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 18.dp),
            verticalArrangement = Arrangement.Bottom
        ){
            Row(
                modifier = Modifier.padding(bottom = 18.dp)
            ){
                Icon(Icons.Rounded.Call, contentDescription = null,modifier = Modifier.padding(end = 18.dp))
                Text(
                    text = stringResource(R.string.number),
                    color = Color(0xFF056406),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier.padding(bottom = 18.dp)
            ){
                Icon(Icons.Rounded.Share, contentDescription = null,modifier = Modifier.padding(end = 18.dp))
                Text(
                    text = stringResource(R.string.alias),
                    color = Color(0xFF056406),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
            Row(
                modifier = Modifier.padding(bottom = 18.dp)
            ){
                Icon(Icons.Rounded.Email, contentDescription = null,modifier = Modifier.padding(end = 18.dp))
                Text(
                    text = stringResource(R.string.email),
                    color = Color(0xFF056406),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }
    }
}


@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    CardTheme {
        Card()
    }
}