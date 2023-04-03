@file:Suppress("ClassName")
package leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class P0042_TrappingRainWaterTest {

    private val solution = P0042_TrappingRainWater()

    @Test
    fun testTrapExample1() {
        val height = intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
        val expectedOutput = 6
        val output = solution.trap(height)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun testTrapExample2() {
        val height = intArrayOf(4, 2, 0, 3, 2, 5)
        val expectedOutput = 9
        val output = solution.trap(height)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun testTrapNullInput() {
        val height = intArrayOf()
        val expectedOutput = 0
        val output = solution.trap(height)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun testTrapCustomInput() {
        val height = intArrayOf(3, 5, 4, 3, 1, 5, 3)
        val expectedOutput = 7 // NOTE: 4 was in the generated code, changed to 7!!)
        val output = solution.trap(height)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun testTrapAllEqual() {
        val height = intArrayOf(3, 3, 3, 3, 3, 3)
        val expectedOutput = 0
        val output = solution.trap(height)
        assertEquals(expectedOutput, output)
    }
}