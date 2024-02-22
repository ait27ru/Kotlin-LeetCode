package problems.easy

import org.junit.jupiter.api.BeforeEach

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FindIndexOfFirstOccurrenceInStringTest {

    private var solution = FindIndexOfFirstOccurrenceInString()

    @BeforeEach
    fun setUp() {
        solution = FindIndexOfFirstOccurrenceInString()
    }

    @Test
    fun strStr_ShouldSatisfy_Example1() {
        // arrange
        val haystack = "sadbutsad"
        val needle = "sad"
        // act
        val actual = solution.strStr(haystack, needle)
        // assert
        assertEquals(0, actual)
    }

    @Test
    fun strStr_ShouldSatisfy_Example2() {
        // arrange
        val haystack = "leetcode"
        val needle = "leeto"
        // act
        val actual = solution.strStr(haystack, needle)
        // assert
        assertEquals(-1, actual)
    }
}