package problems.easy

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RemoveElementTest {
    private var solution = RemoveElement()

    @BeforeEach
    fun setUp() {
        solution = RemoveElement()
    }

    @Test
    fun removeElement_ShouldSatisfy_Example1() {
        // arrange
        val nums = intArrayOf(3, 2, 2, 3)
        val value = 3
        // act
        val actual = solution.removeElement(nums, value)
        // arrange
        assertEquals(2, actual)
        assertArrayEquals(intArrayOf(2, 2), nums.copyOfRange(0, actual))
    }

    @Test
    fun removeElement_ShouldSatisfy_Example2() {
        // arrange
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val value = 2
        // act
        val actual = solution.removeElement(nums, value)
        // arrange
        assertEquals(5, actual)
        assertArrayEquals(intArrayOf(0, 1, 3, 0, 4), nums.copyOfRange(0, actual))
    }
}