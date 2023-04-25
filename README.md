# ChatGPT experiment - generating algorithms in Kotlin

This repo contains solutions generated by ChatGPT (currently at v3.5)
for various problems as stated in the tables below.

I request that ChatGPT create unit tests for each algorithm and then move
these unit tests into the test/kotlin hierarchy.

The repo uses the gradle system to build (*.kts) and is run in
the awesome IntelliJ IDEA integrated developement environment (IDE). 
Current version installed is v2021.3.3.

### LeetCode problems solved


| #    | Title                                                                                 | Solution                                                             | Unit Test                                                               |
|------|---------------------------------------------------------------------------------------|----------------------------------------------------------------------|-------------------------------------------------------------------------|
| 0007 | [reverse-integer](https://leetcode.com/problems/reverse-integer/description/)         | [Kotlin code](./src/main/kotlin/leetcode/P0007_ReverseInteger.kt)    | [Test code](./src/test/kotlin/leetcode/P0007_ReverseIntegerTest.kt)     |
| 0042 | [trapping-rain-water](https://leetcode.com/problems/trapping-rain-water/description/) | [Kotlin code](./src/main/kotlin/leetcode/P0042_TrappingRainWater.kt) | [Test code](./src/test/kotlin/leetcode/P0042_TrappingRainWaterTest.kt)  |
| 0085 | [maximal-rectangle](https://leetcode.com/problems/maximal-rectangle/description/)     | [Kotlin code](./src/main/kotlin/leetcode/P0085_MaximalRectangle.kt)  | [Test code](./src/test/kotlin/leetcode/P0085_MaximalRectangleTest.kt)   |

### Codewars problems solved:

| #    | Name                                                                             | Solution                                                   | Unit Test                                                    |
|------|----------------------------------------------------------------------------------|------------------------------------------------------------|--------------------------------------------------------------|
| ---- | [Two Oldest Ages](https://www.codewars.com/kata/511f11d355fe575d2c000001/kotlin) | [Kotlin code](./src/main/kotlin/codeWars/TwoOldestAges.kt) | [Test code](./src/test/kotlin/codeWars/TwoOldestAgesTest.kt) |
| ---- | [EncryptThis](https://www.codewars.com/kata/5848565e273af816fb000449)            | [Kotlin code](./src/main/kotlin/codeWars/EncryptThis.kt)   | [Test code](./src/test/kotlin/codeWars/EncryptThisTest.kt)   |

### HackerRank problem ("not solved")

| #    | Name                                                                                | Solution                                                         | Unit Test                                                               |
|------|-------------------------------------------------------------------------------------|------------------------------------------------------------------|-------------------------------------------------------------------------|
| ---- | [Buying Show Tickets](https://www.hackerrank.com/work/tests/356098/questions)       | [Kotlin code](./src/main/kotlin/hackerRank/BuyingShowTickets.kt) | [Test code](./src/test/kotlin/hackerRank/BuyingShowTicketsTest.kt)      |

NOTE: The HackerRank test failed because of a timeout.
The test passed for small amounts of tickets, but failed when the test expanded to an array of 100,000 people and 
the first person wanted to buy 467 million tickets.   The expected answer was also, and I am not making this up:

36,176,760,994,361

yep. 36 Billion for the number of iterations to get the last ticket purchased.   No wonder that the thing timed out.

[EDIT] this suggests that the "Buying Show Tickets" solution requires a "Hack" lol
algorithmically to subtract the smallest non-zero ticket remainder from
the patrons to accelerate the loop.  I don't find this hack to be interesting
enough to persue with ChatGPT, and am not all that impressed by the 
problem statement that didn't give a clue that this was necessary to
pass the test framework.

## Bard (Google) 

What is different with Bard is that it has no real history.   When asking for the solution
to an algorithm in Kotlin - it repeats the algorithm along with the 
requested unit tests.   In this respect ChatGPT is MUCH more powerful.
The Google Bard system forgets what the parameter types it used for the
previous solution so you must copy/paste the L&G (latest and greatest) 
solution to make sure the unit tests match the code.

It also suffers from not running the unit tests itself to verify that
the unit tests it generated actually work.   This is a next level problem
for the AGI systems.  When they are able to perform self-testing and self-analysis
of generated code, then they will be truly powerful.  As it stands they are
pretty good code assemblers.

OK on to the experiments.  Because of the limitations above, these 
experiments are likely to be rather small toy algos at this time.

### Bard basic experiments (not related to a test plaform)

Note that the LeetCode 149 solution as of April 25 was not correct.

| #             | Description                                                                              | Solution                                                                | Unit Test                                                                 |
|---------------|------------------------------------------------------------------------------------------|-------------------------------------------------------------------------|---------------------------------------------------------------------------|
| BridgeProblem | [Königsberg Bridge Problem](https://mathworld.wolfram.com/KoenigsbergBridgeProblem.html) | [Kotlin code](./src/main/kotlin/bardGoogle/SevenBridgesOfKonigsberg.kt) | [Test code](./src/test/kotlin/bardGoogle/SevenBridgesOfKonigsbergTest.kt) |
| LeetCode 149  | [Max Points On A Line](https://leetcode.com/problems/max-points-on-a-line/)              | [Kotlin code](./src/main/kotlin/bardGoogle/P0149_MaxPointsOnALine.kt)   | No test code                                                              |



Sources as given by Bard.google.com
1. github.com/AptoPayments/apto-ui-sdk-android
2. github.com/square/okhttp
3. github.com/apache/kafka