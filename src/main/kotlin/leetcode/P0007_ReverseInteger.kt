@file:Suppress("ClassName")

package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Leetcode: https://leetcode.com/problems/reverse-integer/
 *
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit
 * integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers
 * (signed or unsigned).   Please call the solution function "reverse"
 *
 * PLUS (test case):
 * Yes please add a JUNIT5 based unit test that checks three test cases
 * and also checks for zero and an overflow condition.
 */

class P0007_ReverseInteger {
    fun reverse(x: Int): Int {
        var n = x
        var result = 0
        while (n != 0) {
            val digit = n % 10
            n /= 10
            if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && digit > 7)) {
                return 0
            }
            if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && digit < -8)) {
                return 0
            }
            result = result * 10 + digit
        }
        return result
    }
}