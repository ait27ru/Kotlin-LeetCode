package problems.easy

/*
    https://leetcode.com/problems/search-insert-position/description
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.
*/

class SearchInsertPosition {
    fun searchInsert(numbers: IntArray, target: Int): Int {
        // task constraints
        require(numbers.size in 1..10_000)
        require(target in -10_000..10_000)

        var left = 0
        var right = numbers.lastIndex

        while (left <= right) {
            val mid = (left + right) / 2
            when {
                numbers[mid] < target -> left = mid + 1
                numbers[mid] > target -> right = mid - 1
                else -> return mid
            }
        }
        return left
    }
}