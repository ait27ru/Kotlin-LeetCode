package problems.medium

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import problems.medium.PerfectSquares

class PerfectSquaresTest {

    private var solution = PerfectSquares()

    @BeforeEach
    fun setUp() {
        solution = PerfectSquares()
    }

    @Test
    fun numSquares_ShouldSatisfy_MinValueEdgeCase() {
        val num = solution.numSquares(1)
        // 1 = 1 (1x1)
        assertEquals(1, num)
    }

    @Test
    fun numSquares_ShouldSatisfy_MaxValueEdgeCase() {
        val num = solution.numSquares(10_000)
        // 10000 = 10000 (100x100)
        assertEquals(1, num)
    }

    @Test
    fun numSquares_ShouldSatisfy_Example1() {
        val num = solution.numSquares(12)
        // 12 = 4 + 4 + 4
        assertEquals(3, num)
    }

    @Test
    fun numSquares_ShouldSatisfy_Example2() {
        val num = solution.numSquares(13)
        // 13 = 4 + 9
        assertEquals(2, num)
    }

    @Test
    fun numSquares_ShouldSatisfy_Example3() {
        val num = solution.numSquares(5)
        // 5 = 4 + 1
        assertEquals(2, num)
    }
}