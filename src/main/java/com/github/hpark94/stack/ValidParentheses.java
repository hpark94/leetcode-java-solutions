package com.github.hpark94.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 0020
 * Difficulty: Easy
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if
 * the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 * Example 5:
 *
 * Input: s = "([)]"
 *
 * Output: false
 */
public class ValidParentheses {

    /**
     * A string s containing just the characters '(', ')', '{', '}', '[' and ']' is given.
     * Determines if the input string is valid.
     *
     * Time: O(n)
     * Space: O(n)
     *
     * @param s String containing parenthesis
     *
     * @return True if s is valid
     */
    public boolean isValid(String s) {
        Map<String, String> parenthesis = new HashMap<>();
        parenthesis.put("(", ")");
        parenthesis.put("[", "]");
        parenthesis.put("{", "}");

        // Stack class also possible
        Deque<String> open = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            String currentChar = String.valueOf(s.charAt(i));
            if (parenthesis.containsKey(currentChar)) {
                open.push(currentChar);
                continue;
            }

            if (open.isEmpty()) {
                return false;
            }

            String toClose = open.pop();

            if (!parenthesis.get(toClose)
                .equals(currentChar)) {
                return false;
            }
        }

        return open.isEmpty();
    }
}
