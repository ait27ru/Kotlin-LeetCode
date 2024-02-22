package problems.easy

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ValidParenthesesTest {

    private var solution = ValidParentheses()

    @BeforeEach
    fun setUp() {
        solution = ValidParentheses()
    }

    @Test
    fun isValid_ShouldSatisfy_Example1() {
        // arrange
        val s = "()"
        // act
        val actual = solution.isValid(s)
        // assert
        assertTrue(actual)
    }

    @Test
    fun isValid_ShouldSatisfy_Example2() {
        // arrange
        val s = "()[]{}"
        // act
        val actual = solution.isValid(s)
        // assert
        assertTrue(actual)
    }

    @Test
    fun isValid_ShouldSatisfy_Example3() {
        // arrange
        val s = "(]"
        // act
        val actual = solution.isValid(s)
        // assert
        assertFalse(actual)
    }

    @Test
    fun isValid_ShouldSatisfy_Example4() {
        // arrange
        val s = "({[]})"
        // act
        val actual = solution.isValid(s)
        // assert
        assertTrue(actual)
    }
}