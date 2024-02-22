/*
    https://leetcode.com/problems/add-two-numbers/description/
    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single digit.
    Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // task constraints
        require(l1 != null)
        require(l2 != null)

        var list1 = l1
        var list2 = l2
        val root = ListNode(0)
        var curr = root
        var carry = 0

        while (list1 != null || list2 != null || carry != 0) {
            val val1 = list1?.value ?: 0
            val val2 = list2?.value ?: 0
            // Figure out the new digit
            var sum = val1 + val2 + carry
            carry = sum / 10
            sum %= 10
            curr.next = ListNode(sum)
            // Update pointers
            curr = curr.next!!
            list1 = list1?.next
            list2 = list2?.next
        }
        return root.next
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