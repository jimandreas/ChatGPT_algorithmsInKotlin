package codeWars

/**
 CodeWars problem (slightly modified for clarity):

 Please complete the following in Kotlin.  Please include 5 JUNIT5 Unit tests in a separate part of the solution.
 The "twoOldestAges" function needs to be completed. It should take a List of Integers as its argument and return a List of Integers containing the two highest numbers within the array. The returned List of Integers should be in the format [second oldest age,  oldest age].

 The order of the numbers passed in could be any order. The array will always include at least 2 items. If there are two or more oldest age, then return both of them in array format.

 Sample tests (Input --> Output):

 [1, 2, 10, 8] --> [8, 10]
 [1, 5, 87, 45, 8, 8] --> [45, 87]
 [1, 3, 10, 0]) --> [3, 10]
 */
/*
ChatGPT responds with this solution:
The sortedDescending() function sorts the list in descending order,
and we can then take the second and first elements to get the second
oldest and oldest ages, respectively.
 */
class TwoOldestAges {
    fun twoOldestAges(ages: List<Int>): List<Int> {
        val sortedAges = ages.sortedDescending()
        return listOf(sortedAges[1], sortedAges[0])
    }
}