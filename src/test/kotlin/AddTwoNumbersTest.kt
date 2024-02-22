import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AddTwoNumbersTest {

    private var solution = AddTwoNumbers()

    @Test
    fun addTwoNumbers_ShouldSatisfy_Example1() {
        // arrange
        val l1 = listNodeOf(2, 4, 3)
        val l2 = listNodeOf(5, 6, 4)
        // act
        val sum = solution.addTwoNumbers(l1, l2)
        // assert
        assertEquals("7 -> 0 -> 8", sum.toString())
    }

    @Test
    fun addTwoNumbers_ShouldSatisfy_Example2() {
        // arrange
        val l1 = ListNode(0)
        val l2 = ListNode(0)
        // act
        val sum = solution.addTwoNumbers(l1, l2)
        // assert
        assertEquals(0, sum?.value)
    }

    @Test
    fun addTwoNumbers_ShouldSatisfy_Example3() {
        // arrange
        val l1 = listNodeOf(9, 9, 9, 9, 9, 9, 9)
        val l2 = listNodeOf(9, 9, 9, 9)
        // act
        val sum = solution.addTwoNumbers(l1, l2)
        // assert
        assertEquals("8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1", sum.toString())
    }
}