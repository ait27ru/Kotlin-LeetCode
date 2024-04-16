package problems.easy

/*
    https://leetcode.com/problems/binary-tree-postorder-traversal/description
    Given the root of a binary tree, return the postorder traversal of its nodes' values.
*/

class BinaryTreePostorderTraversal {
    fun <T : Any> postorderTraversal(root: TreeNode<T>?): Iterable<T> {
        val list = mutableListOf<T>()
        this.traverse(node = root, visit = { list.addLast(it) })
        return list
    }

    private fun <T : Any> traverse(node: TreeNode<T>?, visit: Visitor<T>) {
        node?.let {
            traverse(it.left, visit)
            traverse(it.right, visit)
            visit(it.value)
        }
    }
}

class TreeNode<T : Any>(var value: T) {
    var left: TreeNode<T>? = null
    var right: TreeNode<T>? = null
}

typealias Visitor<T> = (T) -> Unit