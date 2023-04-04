package codeWars

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TwoOldestAgesTest {
    private val solution = TwoOldestAges()

    /**
     * ChatGPT provided this unit test:
     * Here are five JUnit5 tests for the function:
     */
    @Test
    fun `two oldest ages in list`() {
        assertEquals(listOf(8, 10), solution.twoOldestAges(listOf(1, 2, 10, 8)))
        assertEquals(listOf(45, 87), solution.twoOldestAges(listOf(1, 5, 87, 45, 8, 8)))
        assertEquals(listOf(3, 10), solution.twoOldestAges(listOf(1, 3, 10, 0)))
        assertEquals(listOf(25, 35), solution.twoOldestAges(listOf(35, 25)))
        assertEquals(listOf(5, 5), solution.twoOldestAges(listOf(5, 5, 3, 2, 1)))
    }
}