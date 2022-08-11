package com.felipebertanha.androidunittestingyt

import com.google.common.truth.Truth.assertThat
import org.junit.Test

/**
 * Created by felipebertanha on 11/August/2022
 */
internal class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correct repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "fbertanha",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "fbertanha",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "fbertanha",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digits password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "fbertanha",
            "abcd1",
            "abcd1"
        )
        assertThat(result).isFalse()
    }
}