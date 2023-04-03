@file:Suppress("ClassName")
package leetcode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class P0007_ReverseIntegerTest {
    private val solution = P0007_ReverseInteger()

    /*

Here's a Kotlin implementation of the Solution class that includes a
JUnit5 test class with three test cases and an additional test case to
check for an overflow condition and a test case to check for the value 0:

In this implementation, we define a SolutionTest class that contains four test functions.
We create an instance of the Solution class using the private val keyword.

In the testReversePositive function, we define an input value of 12345,
an expected output value of 54321, and we call the reverse function on the
solution instance with the input value. We then use the assertEquals function
to check if the output matches the expected value.

In the testReverseNegative function, we define an input value of -12345,
an expected output value of -54321, and we call the reverse function on the
solution instance with the input value. We then use the assertEquals function
to check if the output matches the expected value.

In the testReverseZero function, we define an input value of 0, an expected
output value of 0, and we call the reverse function on the solution instance
with the input value. We then use the assertEquals function to check if the
output matches the expected value.

In the testReverseOverflow function, we define an input value of 1534236469,
which is the largest integer that, when reversed, would cause an overflow.
We define an expected output value of 0, since the function should return 0
in the event of an overflow. We call the reverse function on the solution
instance with the input value and use the assertEquals function to check if
the output matches the expected value.

I hope this helps! Let me know if you have any further questions.
     */

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
