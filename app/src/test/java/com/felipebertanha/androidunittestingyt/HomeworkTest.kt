package com.felipebertanha.androidunittestingyt

import com.google.common.truth.Truth.assertThat
import org.junit.Assert
import org.junit.Test

/**
 * Created by felipebertanha on 11/August/2022
 */
class HomeworkTest {

    // Fibonacci tests...
    @Test
    fun `valid number returns expected value`() {
        val result = Homework.fib(10)

        assertThat(result).isEqualTo(55)
    }

    @Test
    fun `negative number returns exception`() {
        Assert.assertThrows(
            IllegalArgumentException::class.java
        ) { Homework.fib(-1) }
    }

    //Braces count tests...
    @Test
    fun `valid braces returns true`() {
        val result = Homework.checkBraces("(a * b)")

        assertThat(result).isTrue()
    }

    @Test
    fun `valid nested braces returns true`() {
        val result = Homework.checkBraces("((a * b) - (c / e))")

        assertThat(result).isTrue()
    }

    @Test
    fun `2 opened braces returns false`() {
        val result = Homework.checkBraces("((a * b)")

        assertThat(result).isFalse()
    }
}