package com.example.clonetuturu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clonetuturu.component.Head
import com.example.clonetuturu.component.Header
import com.example.clonetuturu.component.ServicesCard
import com.example.clonetuturu.component.data.serviceTypes
import com.example.clonetuturu.ui.theme.CloneTuTuruTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CloneTuTuruTheme {
                TutuHomeScreen()
            }
        }
    }
}

@Composable
fun TutuHomeScreen(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 10.dp)
        ) {
            Header()
            Spacer(modifier = Modifier.height(10.dp))
            Head()
            Spacer(modifier = Modifier.height(30.dp))
            LazyVerticalGrid(columns = GridCells.Fixed(3), content = {
                items(serviceTypes) { serviceType ->
                    ServicesCard(serviceType = serviceType)
                }
            })
            Spacer(modifier = Modifier.height(30.dp))
            Card(elevation = 1.dp) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(35.dp)
                        .padding(vertical = 5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(painter = painterResource(id = R.drawable.visa), contentDescription = "card visa", modifier = Modifier.padding(end=10.dp))
                    Icon(painter = painterResource(id = R.drawable.master), contentDescription = "master card", modifier = Modifier.padding(end=10.dp))
                    Icon(painter = painterResource(id = R.drawable.mir), contentDescription = "mir card", modifier = Modifier.padding(end=10.dp))
                    Text(text = "Secure Payment".uppercase(), color = Color(0xff3da112))
                }
            }
            Spacer(modifier = Modifier.height(30.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
                Row() {
                    Image(painter = painterResource(id = R.drawable.one), contentDescription = "one")
//                    Text(text = "Tutu.ru - The Number one traveling service in Russia")
//                    Text(text = "According to SimilarWeb, 2020")
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontWeight = FontWeight.ExtraBold)){
                            append("Tutu.ru - The Number 1\ntraveling service in Russia\n")
                        }
                        withStyle(style = SpanStyle(color = Color.Gray)){
                            append("According to SimilarWeb, 2020")
                        }
                    })
                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CloneTuTuruTheme {
        TutuHomeScreen()
    }
}