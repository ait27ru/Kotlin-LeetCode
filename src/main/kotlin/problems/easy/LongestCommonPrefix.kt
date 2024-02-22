package problems.easy

/*
    https://leetcode.com/problems/longest-common-prefix/
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
*/
class LongestCommonPrefix {
    fun longestCommonPrefix(strings: Array<String>): String {
        var result = ""
        for (i in strings[0].indices) {
            for (j in strings.indices) {
                if (i >= strings[j].length || strings[j][i] != strings[0][i]) {
                    return result
                }
            }
            result += strings[0][i]
        }
        return result
    }
}