package com.github.hpark94.string;

public class LongestPalindromicSubstring {

    /**
     * 0005
     * Difficulty: Medium
     *
     * Given a string s, return the longest in s.
     *
     * Example 1:
     *
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     *
     * Example 2:
     *
     * Input: s = "cbbd"
     * Output: "bb"
     *
     * @param s String to analyze
     *
     * @return Longest palindromic substring
     */
    public String longestPalindrome(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int l = Math.max(expand(s, i, i), expand(s, i, i + 1));
            int left = i - (l - 1) / 2;

            if (l > result.length()) {
                result = s.substring(left, left + l);
            }
        }

        return result;
    }

    public int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return (right - left + 1) - 2;
    }
}
