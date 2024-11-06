package com.example.ucp1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ucp1(){
    Column (modifier = Modifier.fillMaxSize()){
        HeaderSection()
        Text(text = "Plan Your Adventures",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp))

        Text(text = "lest Plan an equisite advanteure",
            modifier = Modifier .padding(10.dp))
    }

}
@Composable
fun HeaderSection() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Blue)
        .padding(15.dp)
    ){
        Row(
            modifier = Modifier .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = "Muhammad Adri",
                    color = Color.White
                )
                Text(text = "Kabupaten Tanggerang",
                    color = Color.White
                )
            }
            Box(contentAlignment = Alignment.BottomStart
            ){
                Image(
                    painterResource(id = R.drawable.orang),
                    contentDescription = "", modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = null
                    )
            }
        }
    }
}