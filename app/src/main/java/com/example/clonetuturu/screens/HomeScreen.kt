package com.example.clonetuturu.screens

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clonetuturu.R
import com.example.clonetuturu.component.Head
import com.example.clonetuturu.component.ServicesCard
import com.example.clonetuturu.component.data.serviceTypes

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    val context = LocalContext.current
        Scaffold(topBar = {
            TopAppBar(title = {}, navigationIcon = {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "app logo",
                    modifier = Modifier
                        .width(100.dp).clickable {
                            Toast.makeText(context, "You clicked on the logo \uD83E\uDD79", Toast.LENGTH_SHORT).show()
                        }
                )
            }, actions = {
                Button(
                    onClick = {
                        Toast.makeText(context, "You clicked on Sign in \uD83E\uDD72", Toast.LENGTH_SHORT).show()
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    border = BorderStroke(width = .5.dp, color = Color(0xFF3F51B5))
                ) {
                    Text(text = "Sign In", fontWeight = FontWeight.ExtraBold, color = Color(
                        0xFF235EDE
                    ), style = MaterialTheme.typography.h6
                    )
                }
                IconButton(onClick = {
                    Toast.makeText(context, "You clicked on the menu \uD83E\uDEE1", Toast.LENGTH_SHORT).show()

                }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            }, backgroundColor = Color.White)
        }) { paddingValue ->
        Surface(modifier = Modifier.padding((paddingValue))) {
//            Header()
            Column(modifier = Modifier.padding(horizontal = 10.dp)) {

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
                Spacer(modifier = Modifier.height(40.dp))

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

                Spacer(modifier = Modifier.height(50.dp))

                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
                    Image(painter = painterResource(id = R.drawable.appstore),
                        contentDescription = "appstore", modifier = Modifier
                            .padding(end = 10.dp)
                            .scale(2f))
                    Spacer(modifier = Modifier.width(70.dp))
                    Image(painter = painterResource(id = R.drawable.android),
                        contentDescription = "playstore", modifier = Modifier.scale(2f))
                }
                Spacer(modifier = Modifier.height(30.dp))

            }
        }

        }
}