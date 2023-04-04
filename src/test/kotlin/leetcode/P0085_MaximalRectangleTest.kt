package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test

internal class P0085_MaximalRectangleTest {

    private val solution = P0085_MaximalRectangle()

    @Test
    fun testMaximalRectangle1() {
        val matrix = arrayOf(
            charArrayOf('1', '0', '1', '0', '0'),
            charArrayOf('1', '0', '1', '1', '1'),
            charArrayOf('1', '1', '1', '1', '1'),
            charArrayOf('1', '0', '0', '1', '0')
        )
        assertEquals(6, solution.maximalRectangle(matrix))
    }

    @Test
    fun testMaximalRectangle2() {
        val matrix = arrayOf(
            charArrayOf('0')
        )
        assertEquals(0, solution.maximalRectangle(matrix))
    }

    @Test
    fun testMaximalRectangle3() {
        val matrix = arrayOf(
            charArrayOf('1')
        )
        assertEquals(1, solution.maximalRectangle(matrix))
    }

    @Test
    fun testMaximalRectangle4() {
        val matrix = arrayOf(
            charArrayOf('0', '0', '0'),
            charArrayOf('0', '0', '0'),
            charArrayOf('0', '0', '0')
        )
        assertEquals(0, solution.maximalRectangle(matrix))
    }

    @Test
    fun testMaximalRectangle5() {
        val matrix = arrayOf(
            charArrayOf('1', '1', '1', '1'),
            charArrayOf('1', '0', '1', '1'),
            charArrayOf('1', '1', '1', '0')
        )
//        assertEquals(6, solution.maximalRectangle(matrix))
        // OpenGPT created this test but had 6 as the expected result.
        //    result "from inspection" should be 4
        assertEquals(4, solution.maximalRectangle(matrix))
    }


}