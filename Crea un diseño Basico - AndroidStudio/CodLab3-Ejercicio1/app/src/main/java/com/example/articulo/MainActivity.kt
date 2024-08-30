package com.example.articulo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.articulo.ui.theme.ArticuloTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticuloTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    ArticuloApp()
                }
            }
        }
    }
}
@Composable
fun ArticuloApp(){
    ArticuloCard(
        title = stringResource(R.string.title_compose),
        shortDes = stringResource(R.string.short_description_compose),
        longDes = stringResource(R.string.long_description_compose),
        imagenPin = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
private fun ArticuloCard(
    title: String,
    shortDes: String,
    longDes : String,
    imagenPin : Painter,
    modifier: Modifier = Modifier,
    ){
    Column(modifier = modifier){
        Image(painter = imagenPin, contentDescription = null,
            modifier = Modifier.padding(top = 24.dp))
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDes,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = longDes,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArticuloTheme {
        ArticuloApp()
    }
}