package problems.easy

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TwoSumTest {

    private var solution = TwoSum()

    @BeforeEach
    fun setUp() {
        solution = TwoSum()
    }

    @Test
    fun twoSum_ShouldSatisfy_Example1() {
        // arrange
        val nums = intArrayOf(2, 7, 11, 15)
        // act
        val result = solution.twoSum(nums, 9)
        // assert
        assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun twoSum_ShouldSatisfy_Example2() {
        // arrange
        val nums = intArrayOf(3, 2, 4)
        // act
        val result = solution.twoSum(nums, 6)
        // assert
        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun twoSum_ShouldSatisfy_Example3() {
        // arrange
        val nums = intArrayOf(3, 3)
        // act
        val result = solution.twoSum(nums, 6)
        // assert
        assertArrayEquals(intArrayOf(0, 1), result)
    }
}