package problems.easy

/*
    https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
    or -1 if needle is not part of haystack.
*/

class FindIndexOfFirstOccurrenceInString {
    fun strStr(haystack: String, needle: String): Int {
        // task constraints
        require(haystack.length in 1..10_000)
        require(needle.length in 1..10_000)
        val lowerCaseEnglish = "^[a-z]+$".toRegex()
        require(lowerCaseEnglish.matchEntire(haystack) != null) { "haystack should be lowercase English" }
        require(lowerCaseEnglish.matchEntire(needle) != null) { "needle should be lowercase English" }

        haystack.forEachIndexed { haystackIndex, _ ->
            var needleIndex = 0
            while (
                needleIndex < needle.length
                && (needleIndex + haystackIndex) < haystack.length
                && haystack[needleIndex + haystackIndex] == needle[needleIndex]
            ) {
                needleIndex++
            }

            if (needleIndex == needle.length) {
                return haystackIndex
            }
        }
        return -1
    }
}