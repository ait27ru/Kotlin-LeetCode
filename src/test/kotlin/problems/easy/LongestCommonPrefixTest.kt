package problems.easy

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LongestCommonPrefixTest {

    private var solution = LongestCommonPrefix()

    @BeforeEach
    fun setUp() {
        solution = LongestCommonPrefix()
    }

    @Test
    fun longestCommonPrefix_ShouldSatisfy_Example1() {
        // arrange
        val strings = arrayOf("flower", "flow", "flight")
        // act
        val result = solution.longestCommonPrefix(strings)
        // assert
        assertEquals("fl", result)
    }

    @Test
    fun longestCommonPrefix_ShouldSatisfy_Example2() {
        // arrange
        val strings = arrayOf("dog", "race car", "car")
        // act
        val result = solution.longestCommonPrefix(strings)
        // assert
        assertEquals("", result)
    }
}