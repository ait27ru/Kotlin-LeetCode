/*
    https://leetcode.com/problems/add-two-numbers/description/
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val root = ListNode(0)
        return root
    }
}

class ListNode(var value: Int) {
    var next: ListNode? = null

    override fun toString(): String = if (next == null) "$value" else "$value -> $next"

    companion object {
        fun create(items: Iterable<Int>): ListNode {

            if (items.firstOrNull() == null) {
                throw IllegalArgumentException()
            }

            var first: ListNode? = null
            var curr = first

            for (item in items) {
                val newNode = ListNode(item)

                if (first == null) {
                    first = newNode
                    curr = first
                    continue
                }
                curr!!.next = newNode
                curr = newNode
            }
            return first!!
        }
    }
}

fun listNodeOf(vararg items: Int): ListNode {
    return ListNode.create(items.asList())
}