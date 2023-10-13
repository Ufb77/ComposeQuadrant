package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
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
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Total()
                }
            }
        }
    }
}

@Composable
fun Total(){
    Column(Modifier.fillMaxWidth()) {

        Row(
            Modifier.weight(1f)
        ) {

            Quadrants(title = stringResource(R.string.title1),
                description = stringResource(R.string.description1),
                modifier = Modifier.weight(1f),
                backColor = Color(0xFFEADDFF))
            Quadrants(title = stringResource(R.string.title2),
                description = stringResource(R.string.description2),
                modifier = Modifier.weight(1f),
                backColor = Color(0xFFD0BCFF))

        }
        Row(
            Modifier.weight(1f)
        ) {

            Quadrants(title = stringResource(R.string.title3),
                description = stringResource(R.string.description3),
                modifier = Modifier.weight(1f),
                backColor = Color(0xFFB69DF8)
            )
            Quadrants(title = stringResource(R.string.title4),
                description = stringResource(R.string.description4),
                modifier = Modifier.weight(1f),
                backColor = Color(0xFFF6EDFF))

        }
    }

}

@Composable
fun Quadrants(
    title: String,
    description: String,
    modifier: Modifier = Modifier,
    backColor: Color
){
    Column(
        modifier = modifier
            .fillMaxSize()
            //.padding(16.dp) No me cuadra con la imagen que hay en el codelab aunque
            // las instrucciones lo ponen
            .background(backColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = description,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Total()
    }
}