package hackerRank

import leetcode.P0042_TrappingRainWater
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTimeoutPreemptively
import org.junit.jupiter.api.Test
import java.time.Duration

import org.junit.jupiter.api.Assertions.*

internal class BuyingShowTicketsTest {

    class WaitingTimeTest {
        private val solution = BuyingShowTickets()
        @Test
        fun `test with given input`() {
            val tickets = intArrayOf(1, 2, 5)
            val p = 1
            assertEquals(4, solution.waitingTime(tickets, p))
        }

        @Test
        fun `test with given quiz input`() {
            val tickets = intArrayOf(2, 6, 3, 4, 5)
            val p = 2
            assertEquals(12, solution.waitingTime(tickets, p))
        }

        @Test
        fun `test with valid input`() {
            val tickets = intArrayOf(2, 6, 3, 4, 5)
            val p = 2
            assertEquals(12, solution.waitingTime(tickets, p))
        }

        @Test
        fun `test with single ticket`() {
            val tickets = intArrayOf(1)
            val p = 0
            assertEquals(1, solution.waitingTime(tickets, p))
        }

        @Test
        fun `test with two tickets`() {
            val tickets = intArrayOf(1, 1)
            val p = 1
            assertEquals(2, solution.waitingTime(tickets, p))
        }

        @Test
        fun `test with two tickets but more`() {
            val tickets = intArrayOf(2, 1)
            val p = 0
            assertEquals(3, solution.waitingTime(tickets, p))
        }

        @Test
        fun `test with two tickets but more and later`() {
            val tickets = intArrayOf(2, 2)
            val p = 1
            assertEquals(4, solution.waitingTime(tickets, p))
        }

        @Test
        fun `test with multiple tickets`() {
            val tickets = intArrayOf(1, 2, 3, 4, 5)
            val p = 2
            assertEquals(10, solution.waitingTime(tickets, p))
        }

        @Test
        fun `test with large input`() {
            val tickets = IntArray(100000) { 2 }
            val p = 1
            assertTimeoutPreemptively(Duration.ofSeconds(20)) {
                assertEquals(100002, solution.waitingTime(tickets, p))
            }
        }
    }

}