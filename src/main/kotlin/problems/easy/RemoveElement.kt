package problems.easy

/*
    https://leetcode.com/problems/remove-element/description
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements in nums which
    are not equal to val. Consider the number of elements in nums which are not equal to val be k,
    to get accepted, you need to do the following things:
    1 Change the array nums such that the first k elements of nums contain the elements
      which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
    2 Return k.
*/

class RemoveElement {
    fun removeElement(nums: IntArray, value: Int): Int {
        // task constraints
        require(nums.size in 0..100)
        require(value in 0..100)

        var retainedElement = 0
        for (i in nums.indices) {
            if (nums[i] != value) {
                nums[retainedElement++] = nums[i]
            }
        }
        return retainedElement
    }
}