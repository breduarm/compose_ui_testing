package com.beam.composeuitesting.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import com.beam.composeuitesting.R

@Composable
fun MyCustomComponent() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Hey", modifier = Modifier.testTag("component-1"))
        Text(text = "Hey", modifier = Modifier.testTag("component-2"))
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "img"
        )
    }
}