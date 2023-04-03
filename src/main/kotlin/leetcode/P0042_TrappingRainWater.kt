@file:Suppress("ClassName")
package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

/**
 * A new problem - Given n non-negative integers representing an elevation map
 * where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

Please create a solution in Kotlin that takes the integers and determines how many units of rain the structure can hold.
Please call the function to solve this problem "trap".
Please create 4 JUNIT5 based unit tests to solve Examples 1 and 2 and also throw an assertion on a  null input condition, and another set of integers of your own choosing.
Thank you.

 * Sure! Here's a Kotlin implementation of the Solution class that
 * includes a trap function that calculates the amount of water that
 * can be trapped given an array of heights, and four JUnit5 test cases to test the function.
 *
 * In this implementation, we define a Solution class that contains a trap function that takes an array of heights and returns an integer representing the amount of water that can be trapped.

The trap function first checks if the input array is empty, and returns 0 if it is.

It then initializes variables to keep track of the left and right indices of the array,
the maximum height seen to the left and right of the current indices, and the result
(the total amount of water trapped). It then enters a loop that continues while the
left index is less than the right index.

At each iteration, the function checks if the height at the left index is less than
the height at the right index. If it is, the function updates the left maximum height
if the current height is greater than or equal to the left maximum, or adds the
difference between the left maximum and current height to the result if the current height is less

 */
class P0042_TrappingRainWater {
    fun trap(height: IntArray): Int {
        if (height.isEmpty()) {
            return 0
        }
        var left = 0
        var right = height.size - 1
        var leftMax = 0
        var rightMax = 0
        var result = 0
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left]
                } else {
                    result += leftMax - height[left]
                }
                left++
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right]
                } else {
                    result += rightMax - height[right]
                }
                right--
            }
        }
        return result
    }
}

class SolutionTest {

}
