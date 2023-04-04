# ChatGPT experiment - generating algorithms in Kotlin

This repo contains solutions generated by ChatGPT (currently at v3.5)
for various problems as stated in the tables below.

I request that ChatGPT create unit tests for each algorithm and then move
these unit tests into the test/kotlin hierarchy.

The repo uses the gradle system to build (*.kts) and is run in
the awesome IntelliJ IDEA integrated developement environment (IDE). 
Current version installed is v2021.3.3.

## LeetCode problems solved


| #    | Title                                                                                 | Solution                                                             | Unit Test                                                               |
|------|---------------------------------------------------------------------------------------|----------------------------------------------------------------------|-------------------------------------------------------------------------|
| 0007 | [reverse-integer](https://leetcode.com/problems/reverse-integer/description/)         | [Kotlin code](./src/main/kotlin/leetcode/P0007_ReverseInteger.kt)    | [Test code](./src/test/kotlin/leetcode/P0007_ReverseIntegerTest.kt)     |
| 0042 | [trapping-rain-water](https://leetcode.com/problems/trapping-rain-water/description/) | [Kotlin code](./src/main/kotlin/leetcode/P0042_TrappingRainWater.kt) | [Test code](./src/test/kotlin/leetcode/P0042_TrappingRainWaterTest.kt)  |
| 0085 | [trapping-rain-water](https://leetcode.com/problems/maximal-rectangle/description/)   | [Kotlin code](./src/main/kotlin/leetcode/P0085_MaximalRectangle.kt)  | [Test code](./src/test/kotlin/leetcode/P0085_MaximalRectangleTest.kt)   |
