package problems.medium

import kotlin.math.min

/*
    https://leetcode.com/problems/perfect-squares/description/
    Given an integer n, return the least number of perfect square numbers that sum to n.
    A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.
    For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
*/

class PerfectSquares {

    fun numSquares(n: Int): Int {
        // task constraints
        require(n in 1..10_000)

        val dp = IntArray(n + 1)
        dp.fill(n)
        dp[0] = 0
        dp[1] = 1
        for (targetSquare in 1..n) {
            for (side in 1..targetSquare) {
                val currentSquare = side * side
                val restSquare = targetSquare - currentSquare
                if (restSquare < 0) {
                    break
                }
                dp[targetSquare] = min(dp[targetSquare], 1 + dp[restSquare])
            }
        }
        return dp[n]
    }
}