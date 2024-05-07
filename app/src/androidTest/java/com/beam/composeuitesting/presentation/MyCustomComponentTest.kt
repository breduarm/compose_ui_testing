package com.beam.composeuitesting.presentation

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class MyCustomComponentTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun myFirstTest() {
        composeTestRule.setContent {
            MyCustomComponent()
        }
    }
}