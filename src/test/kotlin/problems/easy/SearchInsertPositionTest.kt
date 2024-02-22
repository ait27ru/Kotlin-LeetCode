package problems.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SearchInsertPositionTest {

    private var solution = SearchInsertPosition()

    @BeforeEach
    fun setUp() {
        solution = SearchInsertPosition()
    }

    @Test
    fun searchInsert_ShouldSatisfy_Example1() {
        // arrange
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        // act
        val targetIndex = solution.searchInsert(nums, target)
        // assert
        assertEquals(2, targetIndex)
    }

    @Test
    fun searchInsert_ShouldSatisfy_Example2() {
        // arrange
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        // act
        val targetIndex = solution.searchInsert(nums, target)
        // assert
        assertEquals(1, targetIndex)
    }

    @Test
    fun searchInsert_ShouldSatisfy_Example3() {
        // arrange
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        // act
        val targetIndex = solution.searchInsert(nums, target)
        // assert
        assertEquals(4, targetIndex)
    }
}