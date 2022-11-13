package com.holden.happybirthdaytheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.holden.happybirthdaytheme.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ImageDisplay("Text composable", "Displays text and follows Material Design guidelines.","Row composable","A layout composable that places its children in a horizontal sequence.\n")
                    ImageDisplay2("Image composable","Creates a composable that lays out and draws a given Painter class object.","Column Composable","A layout composable that places its children in a vertical sequence.")
                }
            }
        }
    }
}

@Composable
fun TextDisplay(header1: String, body1: String){
    Column(
        modifier = Modifier
            .background(Color.Green)
            .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
            .fillMaxHeight(0.5f)
            .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Text(
            text = header1,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
        )
        Text(
            text = body1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun TextDisplay2(header2: String, body2: String){
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
            .fillMaxHeight()
            .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Text(
            text = header2,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
        )
        Text(
            text = body2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Composable
fun TextDisplay3(header1: String, body1: String){
    Column(
        modifier = Modifier
            .background(Color.Yellow)
            .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
            .fillMaxHeight(0.5f)
            .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Text(
            text = header1,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
        )
        Text(
            text = body1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Composable
fun TextDisplay4(header2: String, body2: String){
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
            .fillMaxHeight()
            .wrapContentHeight(Alignment.CenterVertically)
    ) {
        Text(
            text = header2,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
        )
        Text(
            text = body2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
    }
}

@Composable
fun ImageDisplay(header1: String, body1: String, header2: String, body2: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth(0.5f)
    ){
        TextDisplay(header1 = header1, body1 = body1)
        TextDisplay2(header2 = header2, body2 = body2)
    }
}

@Composable
fun ImageDisplay2(header1: String, body1: String, header2: String, body2: String) {
    Column(
        modifier = Modifier
    ){
        TextDisplay3(header1 = header1, body1 = body1)
        TextDisplay4(header2 = header2, body2 = body2)
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            ImageDisplay("Text composable","Displays text and follows Material Design guidelines.","Row composable","A layout composable that places its children in a horizontal sequence.\n")
            ImageDisplay2("Image composable","Creates a composable that lays out and draws a given Painter class object.","Column Composable","A layout composable that places its children in a vertical sequence.")
        }
       }
}