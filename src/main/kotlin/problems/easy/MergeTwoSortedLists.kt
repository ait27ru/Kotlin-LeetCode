package problems.easy

/*
    https://leetcode.com/problems/merge-two-sorted-lists/description
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list.
    The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
*/

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val head = ListNode(0)
        var current = head

        var myList1 = list1
        var myList2 = list2

        while (myList1 != null && myList2 != null) {
            if (myList1.`val` < myList2.`val`) {
                current.next = myList1
                myList1 = myList1.next
            } else {
                current.next = myList2
                myList2 = myList2.next
            }
            current = current.next!!
        }
        current.next = myList1 ?: myList2
        return head.next
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    companion object {
        fun create(items: Iterable<Int>): ListNode? {
            var list: ListNode? = null
            var head: ListNode? = null
            for (item in items) {
                val newNode = ListNode(item)
                if (head == null) {
                    list = newNode
                    head = newNode
                } else {
                    list!!.next = newNode
                    list = list.next
                }
            }
            return head
        }
    }
}

fun listNodesOf(vararg elements: Int): ListNode? {
    return ListNode.create(elements.asIterable())
}