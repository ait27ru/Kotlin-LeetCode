package problems.easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ValidParenthesesTest {

    private var solution = ValidParentheses()

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