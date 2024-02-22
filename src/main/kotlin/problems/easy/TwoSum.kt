package problems.easy

/*
    https://leetcode.com/problems/two-sum/description/
    Given an array of integers nums and an integer target, return indices of the two numbers such that
    they add up to target. You may assume that each input would have exactly one solution,
    and you may not use the same element twice. You can return the answer in any order.
*/
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // task constraints
        require(nums.size in 2..10_000)
        require(target in -1_000_000_000..1_000_000_000)

        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val delta = target - nums[i]
            if (map.contains(delta)) {
                return intArrayOf(map[delta]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}