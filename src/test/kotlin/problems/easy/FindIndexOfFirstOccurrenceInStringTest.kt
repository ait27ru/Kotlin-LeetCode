package problems.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FindIndexOfFirstOccurrenceInStringTest {

    private var solution = FindIndexOfFirstOccurrenceInString()

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