package com.beam.composeuitesting.presentation

import androidx.compose.ui.test.assertContentDescriptionContains
import androidx.compose.ui.test.assertContentDescriptionEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertIsFocused
import androidx.compose.ui.test.assertIsNotDisplayed
import androidx.compose.ui.test.assertIsNotEnabled
import androidx.compose.ui.test.assertIsNotFocused
import androidx.compose.ui.test.assertIsNotSelected
import androidx.compose.ui.test.assertIsOff
import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.doubleClick
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.longClick
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performImeAction
import androidx.compose.ui.test.performScrollTo
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import androidx.compose.ui.test.performTextReplacement
import androidx.compose.ui.test.performTouchInput
import androidx.compose.ui.test.swipe
import androidx.compose.ui.test.swipeDown
import androidx.compose.ui.test.swipeLeft
import androidx.compose.ui.test.swipeRight
import androidx.compose.ui.test.swipeUp
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

        // Actions
        composeTestRule.onNodeWithText(text = "hey", ignoreCase = true).performClick()
        composeTestRule.onNodeWithText(text = "hey", ignoreCase = true).performTouchInput {
            longClick()
            doubleClick()
            swipeDown()
            swipeUp()
            swipeLeft()
            swipeRight()
        }
        composeTestRule.onNodeWithText(text = "hey", ignoreCase = true).performScrollTo().performClick()
        composeTestRule.onNodeWithText(text = "hey", ignoreCase = true).performImeAction()
        composeTestRule.onNodeWithText(text = "hey", ignoreCase = true).performTextClearance()
        composeTestRule.onNodeWithText(text = "hey", ignoreCase = true).performTextInput("This")
        composeTestRule.onNodeWithText(text = "hey", ignoreCase = true).performTextReplacement("This")

        // Assertions
        composeTestRule.onNodeWithText(text = "hey").assertExists()
        composeTestRule.onNodeWithText(text = "hey").assertDoesNotExist()
        composeTestRule.onNodeWithText(text = "hey").assertContentDescriptionEquals("This")
        composeTestRule.onNodeWithText(text = "hey").assertContentDescriptionContains("hey")
        composeTestRule.onNodeWithText(text = "hey").assertIsDisplayed()
        composeTestRule.onNodeWithText(text = "hey").assertIsNotDisplayed()
        composeTestRule.onNodeWithText(text = "hey").assertIsEnabled()
        composeTestRule.onNodeWithText(text = "hey").assertIsNotEnabled()
        composeTestRule.onNodeWithText(text = "hey").assertIsSelected()
        composeTestRule.onNodeWithText(text = "hey").assertIsNotSelected()
        composeTestRule.onNodeWithText(text = "hey").assertIsFocused()
        composeTestRule.onNodeWithText(text = "hey").assertIsNotFocused()
        composeTestRule.onNodeWithText(text = "hey").assertIsOn()
        composeTestRule.onNodeWithText(text = "hey").assertIsOff()
        composeTestRule.onNodeWithText(text = "hey").assertTextEquals("")
        composeTestRule.onNodeWithText(text = "hey").assertTextContains("")
    }
}