package com.home.kotlinespressodemo.common.test

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.home.kotlinespressodemo.R
import com.home.kotlinespressodemo.view.MainFragment
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

abstract class CommonMainTest {

    @Before
    fun setup() {
        launchFragmentInContainer<MainFragment>(themeResId = R.style.AppTheme)
    }

    @Test
    fun testFailure() {
        val isSuccess = false
        val failureAccount = "ddqdqw3343432"
        val failurePassword = "luiluil856858"
        onView(withId(R.id.text_input_edit_text_account)).perform(typeText(failureAccount))
        onView(withId(R.id.text_input_edit_text_password)).perform(typeText(failurePassword))
        onView(withId(R.id.button)).perform(click())
        assertTrue(isSuccess)
    }

    @Test
    fun testSuccess() {
        val isSuccess = true
        val successAccount = "test001"
        val successPassword = "test002"
        onView(withId(R.id.text_input_edit_text_account)).perform(typeText(successAccount))
        onView(withId(R.id.text_input_edit_text_password)).perform(typeText(successPassword))
        onView(withId(R.id.button)).perform(click())
        assertTrue(isSuccess)
    }
}
