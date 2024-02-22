package problems.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class BinaryTreePostorderTraversalTest {

    private var solution = BinaryTreePostorderTraversal()

    @BeforeEach
    fun setUp() {
        solution = BinaryTreePostorderTraversal()
    }

    @Test
    fun postorderTraversal_ShouldReturnListWithAllTreeNodesPostorder() {
        // arrange
        val root = TreeNode(1)
        val n2 = TreeNode(2)
        val n3 = TreeNode(3)
        root.right = n2
        n2.left = n3
        // act
        val treeNodes = solution.postorderTraversal(root)
        // assert
        assertIterableEquals(listOf(3, 2, 1), treeNodes)
    }

    @Test
    fun postorderTraversal_ShouldReturnEmptyList() {
        // arrange
        val root: TreeNode<Int>? = null
        // act
        val treeNodes = solution.postorderTraversal(root)
        // assert
        assertIterableEquals(emptyList<Int>(), treeNodes)
    }

    @Test
    fun postorderTraversal_ShouldReturnListWithSingleItem() {
        // arrange
        val root = TreeNode(1)
        // act
        val treeNodes = solution.postorderTraversal(root)
        // assert
        assertIterableEquals(listOf(1), treeNodes)
    }
}