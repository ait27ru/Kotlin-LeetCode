package problems.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MergeTwoSortedListsTest {

    private var solution = MergeTwoSortedLists()

    @Test
    fun mergeTwoLists_ShouldSatisfy_Example1() {
        // arrange
        val list1 = listNodesOf(1, 2, 4)
        val list2 = listNodesOf(1, 3, 4)
        var expected = listNodesOf(1, 1, 2, 3, 4, 4)
        // act
        var actual = solution.mergeTwoLists(list1, list2)
        // assert
        while (actual != null || expected != null) {
            assertEquals(expected!!.`val`, actual!!.`val`)
            actual = actual.next
            expected = expected.next
        }
    }

    @Test
    fun mergeTwoLists_ShouldSatisfy_Example2() {
        // arrange
        val list1 = listNodesOf()
        val list2 = listNodesOf()
        var expected = listNodesOf()
        // act
        var actual = solution.mergeTwoLists(list1, list2)
        // assert
        while (actual != null || expected != null) {
            assertEquals(expected!!.`val`, actual!!.`val`)
            actual = actual.next
            expected = expected.next
        }
    }

    @Test
    fun mergeTwoLists_ShouldSatisfy_Example3() {
        // arrange
        val list1 = listNodesOf()
        val list2 = listNodesOf(0)
        var expected = listNodesOf(0)
        // act
        var actual = solution.mergeTwoLists(list1, list2)
        // assert
        while (actual != null || expected != null) {
            assertEquals(expected!!.`val`, actual!!.`val`)
            actual = actual.next
            expected = expected.next
        }
    }
}