package problems.easy

/*
    https://leetcode.com/problems/valid-parentheses/description
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.
    An input string is valid if:
      - Open brackets must be closed by the same type of brackets.
      - Open brackets must be closed in the correct order.
      - Every close bracket has a corresponding open bracket of the same type.
*/
class ValidParentheses {
    fun isValid(s: String): Boolean {
        // task constraints
        require(s.length in 1..10_000)

        val stack = ArrayDeque<Char>()
        for (ch in s) {
            if (isOpeningParenthesis(ch)) {
                stack.addLast(ch)
            } else {
                if (stack.isEmpty() || !isMatchingParenthesis(stack.removeLast(), ch)) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }

    private fun isMatchingParenthesis(opening: Char, closing: Char): Boolean =
        (opening == '{' && closing == '}')
                || (opening == '(' && closing == ')')
                || (opening == '[' && closing == ']')

    private fun isOpeningParenthesis(ch: Char): Boolean = ch == '(' || ch == '{' || ch == '['
}