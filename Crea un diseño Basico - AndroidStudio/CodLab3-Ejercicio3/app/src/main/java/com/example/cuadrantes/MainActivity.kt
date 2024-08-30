package com.example.cuadrantes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantes.ui.theme.CuadrantesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadrantesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrantes()
                }
            }
        }
    }
}

@Composable
fun Cuadrantes(){
    Column(
        Modifier.fillMaxWidth()
    ) {
        Row(Modifier.weight(1f)){
            CardInfo(
                title = stringResource(R.string.title_one),
                description = stringResource(R.string.description_one),
                BackColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            CardInfo(
                title = stringResource(R.string.title_two),
                description = stringResource(R.string.description_two),
                BackColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)){
            CardInfo(
                title = stringResource(R.string.title_three),
                description = stringResource(R.string.description_three),
                BackColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            CardInfo(
                title = stringResource(R.string.title_four),
                description = stringResource(R.string.description_four),
                BackColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun CardInfo(
    title: String,
    description: String,
    BackColor: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(BackColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadrantesTheme {
        Cuadrantes()
    }
}