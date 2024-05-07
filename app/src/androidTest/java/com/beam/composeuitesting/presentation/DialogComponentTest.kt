package com.beam.composeuitesting.presentation

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class DialogComponentTest {

    @get: Rule
    val composeTestRule = createComposeRule()

    @Test
    fun whenDialogGetATrue_thenShowDialog() {
        composeTestRule.setContent {
            AddTaskDialog(show = true, onDismiss = {}) {

            }
        }

        composeTestRule.onNodeWithTag("addTaskDialog").assertIsDisplayed()
    }

    @Test
    fun whenDialogGetAFalse_thenDoNotShowDialog() {
        composeTestRule.setContent {
            AddTaskDialog(show = false, onDismiss = {}, onAddTask = {})
        }

        composeTestRule.onNodeWithTag("addTaskDialog").assertDoesNotExist()
    }
}