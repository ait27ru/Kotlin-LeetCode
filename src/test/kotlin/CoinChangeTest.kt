import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CoinChangeTest {

    private var solution = CoinChange()

    @BeforeEach
    fun setUp() {
        solution = CoinChange()
    }

    @Test
    fun coinChange_ShouldSatisfy_Example1() {
        // arrange
        val coins = intArrayOf(1, 2, 5)
        val amount = 11
        // act
        val coinsNumber = solution.coinChange(coins, amount)
        // assert
        assertEquals(3, coinsNumber)
    }

    @Test
    fun coinChange_ShouldSatisfy_Example2() {
        // arrange
        val coins = intArrayOf(2)
        val amount = 3
        // act
        val coinsNumber = solution.coinChange(coins, amount)
        // assert
        assertEquals(-1, coinsNumber)
    }

    @Test
    fun coinChange_ShouldSatisfy_Example3() {
        // arrange
        val coins = intArrayOf(1)
        val amount = 0
        // act
        val coinsNumber = solution.coinChange(coins, amount)
        // assert
        assertEquals(0, coinsNumber)
    }
}