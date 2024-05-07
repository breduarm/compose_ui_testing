package com.beam.composeuitesting.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import com.beam.composeuitesting.R

@Composable
fun MyCustomComponent() {
    var name by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        TextField(value = name, onValueChange = { name = it })
        Text(text = "Hey", modifier = Modifier.testTag("component-1"))
        Text(text = "Your name is $name")
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "img"
        )
    }
}