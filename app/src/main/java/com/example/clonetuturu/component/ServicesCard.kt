package com.example.clonetuturu.component
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.clonetuturu.component.data.ServiceType
import com.example.clonetuturu.component.data.serviceTypes

@Composable
fun ServicesCard(serviceType: ServiceType) {
    Card(
        elevation = 5.dp,
        backgroundColor = Color(0xFFF2EBFD),
        modifier = Modifier.padding(5.dp)
    ){
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.width(115.dp).height(70.dp)
        ) {
            Icon(painter = painterResource(id = serviceType.imageId), contentDescription = serviceType.name,
                tint = Color.Blue)
            Text(text = serviceType.name, color = Color.Blue)
        }
    }
}