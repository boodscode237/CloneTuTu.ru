package com.example.clonetuturu.component
import com.example.clonetuturu.R

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
//import androidx.compose.material.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Header(){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "app logo",
            modifier = Modifier
//                        .size(100.dp)
                .width(100.dp)
                .padding(10.dp)
//                    .height(50.dp)
        )
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
        ){
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                border = BorderStroke(width = .5.dp, color = Color(0xFF3F51B5))
            ) {
                Text(text = "Sign In", fontWeight = FontWeight.ExtraBold, color = Color(
                    0xFF235EDE
                ), style = MaterialTheme.typography.h6
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        }
    }
}