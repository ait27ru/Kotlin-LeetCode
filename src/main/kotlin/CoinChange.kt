import kotlin.math.min

/*
    https://leetcode.com/problems/coin-change/description/
    You are given an integer array coins representing coins of different denominations and
    an integer amount representing a total amount of money.
    Return the fewest number of coins that you need to make up that amount.
    If that amount of money cannot be made up by any combination of the coins, return -1.
    You may assume that you have an infinite number of each kind of coin.
*/

class CoinChange {
    fun coinChange(coins: IntArray, amount: Int): Int {
        require(coins.size in 1..12)
        require(amount in 0..10_000)

        val maxAmount = amount + 1

        val dp = IntArray(maxAmount) { maxAmount }
        dp[0] = 0

        for (currentAmount in 1..dp.lastIndex) {
            for (coin in coins) {
                if (currentAmount - coin >= 0) {
                    dp[currentAmount] = min(dp[currentAmount], 1 + dp[currentAmount - coin])
                }
            }
        }
        return if (dp[amount] == maxAmount) -1 else dp[amount]
    }
}