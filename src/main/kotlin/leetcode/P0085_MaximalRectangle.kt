@file:Suppress("ClassName", "KDocUnresolvedReference")
package leetcode

import java.util.*

/**
0085 Maximal Rectangle
https://leetcode.com/problems/maximal-rectangle/

Problem statement:

Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
Please provide a function "maximalRectangle" in Kotlin and provide 5 JUNIT5 unit tests that test the function.
The function takes an argument named "matrix" it is a kotlin Array of CharArray.
rows == matrix.length
cols == matrix[i].length
matrix[i][j] is '0' or '1'.

Test cases:
Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 6

Input: matrix = [["0"]]
Output: 0

Input: matrix = [["1"]]
Output: 1
Thank you!
 */

/*
response:
Here's a Kotlin solution to the "Maximal Rectangle" problem along with 5 JUnit5 based unit tests:
(Note: ChatGPT did not provide any documentation about the function of the algorithm this time.)

Followup:
leetcode did not like the Kotlin 1.4 "removeLast()" function.  So I asked ChatGPT to redo
the solution and avoid using the "removeLast()" function.  The first solution was renamed
below to "maximalRectangle2".  Note that both solutions pass the unit tests.

ChatGPT notes that the new solution:
"This solution still maintains the same time complexity of O(rows * cols) and space complexity of O(cols)."

The new "maximalRectangle()" function passed the leetCode test.
 */

class P0085_MaximalRectangle {
    fun maximalRectangle(matrix: Array<CharArray>): Int {
        if (matrix.isEmpty()) {
            return 0
        }

        val m = matrix.size
        val n = matrix[0].size

        val heights = IntArray(n) // an array to store the height of bars in each column
        var maxArea = 0

        for (i in 0 until m) {
            // update the heights array for each row
            for (j in 0 until n) {
                if (matrix[i][j] == '0') {
                    heights[j] = 0 // reset the height if the current cell has a value of '0'
                } else {
                    heights[j] += 1 // update the height if the current cell has a value of '1'
                }
            }

            // calculate the largest rectangle for the current row
            val stack = LinkedList<Int>()
            var j = 0
            while (j <= n) {
                val h = if (j == n) 0 else heights[j] // set the height to zero for the extra column outside the matrix
                if (stack.isEmpty() || h >= heights[stack.peek()]) {
                    stack.push(j++)
                } else {
                    val top = stack.pop()
                    maxArea = maxOf(maxArea, heights[top] * (if (stack.isEmpty()) j else j - stack.peek() - 1))
                }
            }
        }

        return maxArea
    }

    fun maximalRectangle2(matrix: Array<CharArray>): Int {
        if (matrix.isEmpty()) return 0

        val numRows = matrix.size
        val numCols = matrix[0].size

        val heights = IntArray(numCols)
        var maxArea = 0

        for (row in 0 until numRows) {
            for (col in 0 until numCols) {
                if (matrix[row][col] == '1') {
                    heights[col]++
                } else {
                    heights[col] = 0
                }
            }
            maxArea = maxOf(maxArea, largestRectangleArea(heights))
        }

        return maxArea
    }

    private fun largestRectangleArea(heights: IntArray): Int {
        val stack = mutableListOf<Int>()
        var maxArea = 0

        for (i in heights.indices) {
            while (stack.isNotEmpty() && heights[i] < heights[stack.last()]) {
                val height = heights[stack.removeLast()]
                val width = if (stack.isEmpty()) i else i - stack.last() - 1
                maxArea = maxOf(maxArea, height * width)
            }
            stack.add(i)
        }

        while (stack.isNotEmpty()) {
            val height = heights[stack.removeLast()]
            val width = if (stack.isEmpty()) heights.size else heights.size - stack.last() - 1
            maxArea = maxOf(maxArea, height * width)
        }

        return maxArea
    }
}

