package bardGoogle

import codeWars.TwoOldestAges
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SevenBridgesOfKonigsbergTest {

    private val solution = SevenBridgesOfKonigsberg()

    /**
     * This unit test creates a graph for the Königsberg Bridge Problem
     * and then tries to find a path that visits all of the bridges.
     * The test asserts that the problem is not solvable, which is the correct result.
     */
    @Test
    fun testKonigsbergBridgeProblem() {
        // Create the graph for the Königsberg Bridge Problem.
        val graph = mutableMapOf<String, MutableList<String>>()
        graph["A"] = mutableListOf("B", "C")
        graph["B"] = mutableListOf("A", "C", "D")
        graph["C"] = mutableListOf("A", "B", "D")
        graph["D"] = mutableListOf("B", "C")

        // Try to find a path that visits all of the bridges.
        val solvable = solution.solveKonigsbergBridgeProblem(graph)

        // Assert that the problem is not solvable.
        assertFalse(solvable)
    }

    @Test
    fun testOneBridge() {
        // Create a graph with one bridge.
        val graph = mutableMapOf<String, MutableList<String>>()
        graph["A"] = mutableListOf("B")
        graph["B"] = mutableListOf("A")

        // Try to find a path that visits all of the bridges.
        val solvable = solution.solveKonigsbergBridgeProblem(graph)

        // Assert that the problem is solvable.
        assertTrue(solvable)
    }

    @Test
    fun testThreeBridges() {
        // Create a graph with three bridges.
        val graph = mutableMapOf<String, MutableList<String>>()
        graph["A"] = mutableListOf("B", "C")
        graph["B"] = mutableListOf("A", "C")
        graph["C"] = mutableListOf("A", "B")

        // Try to find a path that visits all of the bridges.
        val solvable = solution.solveKonigsbergBridgeProblem(graph)

        // Assert that the problem is solvable.
        assertTrue(solvable)
    }

    @Test
    fun testNoBridges() {
        // Create a graph with no bridges.
        val graph = mutableMapOf<String, MutableList<String>>()
        graph["A"] = mutableListOf()
        graph["B"] = mutableListOf()
        graph["C"] = mutableListOf()

        // Try to find a path that visits all of the bridges.
        val solvable = solution.solveKonigsbergBridgeProblem(graph)

        // Assert that the problem is solvable.
        assertTrue(solvable)
    }




}