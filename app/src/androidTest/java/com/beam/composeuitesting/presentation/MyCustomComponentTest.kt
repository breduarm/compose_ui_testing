package com.beam.composeuitesting.presentation

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
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
        // Finder
        composeTestRule.onNodeWithText(text = "hey", ignoreCase = true)
        composeTestRule.onNodeWithTag(testTag = "component-1")
        composeTestRule.onNodeWithContentDescription("img")

        composeTestRule.onAllNodesWithTag("component-1")
    }
}