package com.github.hpark94.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 0032
 * Difficulty: Hard
 *
 * Given a string containing just the characters '(' and ')', return the length of the longest
 * valid (well-formed) parentheses.
 *
 * Example 1:
 *
 * Input: s = "(()"
 * Output: 2
 * Explanation: The longest valid parentheses substring is "()".
 *
 * Example 2:
 *
 * Input: s = ")()())"
 * Output: 4
 * Explanation: The longest valid parentheses substring is "()()".
 *
 * Example 3:
 *
 * Input: s = ""
 * Output: 0
 */
public class LongestValidParentheses {

    /**
     * A string containing just the characters '(' and ')' is given. Returns the length of the
     * longest valid (well-formed) parentheses.
     *
     * Time: O(n)
     * Space: O(n)
     *
     * @param s String to analyze
     *
     * @return Length of longest valid parentheses
     */
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
                continue;
            }

            stack.pop();

            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }

            maxLen = Math.max(maxLen, i - stack.peek());
        }

        return maxLen;
    }

    // public int longestValidParentheses(String s) {
    //     Map<String, String> map = new HashMap<>();
    //     map.put("(", ")");
    //
    //     Deque<String> stack = new ArrayDeque<>();
    //     int validLength = 0;
    //     int count = 0;
    //     int potentialLength = 0;
    //
    //     for (int i = 0; i < s.length(); i++) {
    //         String current = String.valueOf(s.charAt(i));
    //         if (map.containsKey(current) && !stack.isEmpty()) {
    //             stack.push(current);
    //             continue;
    //         }
    //
    //         if (map.containsKey(current)) {
    //             potentialLength += count;
    //             stack.push(current);
    //             count = 0;
    //             continue;
    //         }
    //
    //         if (!map.containsKey(current) && !stack.isEmpty()) {
    //             String toClose = stack.pop();
    //             if (map.get(toClose)
    //                 .equals(current)) {
    //                 count += 2;
    //                 continue;
    //             }
    //         }
    //
    //         potentialLength += count;
    //         validLength      = Math.max(potentialLength, validLength);
    //         count            = 0;
    //         potentialLength  = 0;
    //         stack.clear();
    //     }
    //
    //     if (stack.isEmpty()) {
    //         potentialLength += count;
    //     }
    //
    //     potentialLength = Math.max(count, potentialLength);
    //     validLength     = Math.max(potentialLength, validLength);
    //
    //     return validLength;
    // }
}
