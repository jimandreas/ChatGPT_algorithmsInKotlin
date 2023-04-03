@file:Suppress("ClassName")
package leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class P0007_ReverseIntegerTest {
    private val solution = P0007_ReverseInteger()

    @Test
    @DisplayName("testReversePositive")
    fun testReversePositive() {
        val input = 12345
        val expectedOutput = 54321
        val output = solution.reverse(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun testReverseNegative() {
        val input = -12345
        val expectedOutput = -54321
        val output = solution.reverse(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun testReverseZero() {
        val input = 0
        val expectedOutput = 0
        val output = solution.reverse(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun testReverseOverflow() {
        val input = 1534236469
        val expectedOutput = 0
        val output = solution.reverse(input)
        assertEquals(expectedOutput, output)
    }
}
