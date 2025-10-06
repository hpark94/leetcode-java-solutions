package com.github.hpark94.string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring solution;

    @BeforeEach
    void setup() {
        solution = new LongestPalindromicSubstring();
    }

    @Test
    void testLongestPalindrome1() {
        String s = "babad";
        String expected = "bab";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result);

    }

    @Test
    void testLongestPalindrome2() {
        String s = "cbbd";
        String expected = "bb";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result);

    }

    @Test
    void testLongestPalindrome3() {
        String s = "xabax";
        String expected = "xabax";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result);

    }

    @Test
    void testLongestPalindrome4() {
        String s = "xabay";
        String expected = "aba";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result);

    }

    @Test
    void testLongestPalindrome5() {
        String s = "xabayxdsdfdxxdfd";
        String expected = "dfdxxdfd";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result);

    }

    @Test
    void testLongestPalindrome6() {
        String s = "a";
        String expected = "a";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result);

    }

    @Test
    void testLongestPalindrome7() {
        String s = "bb";
        String expected = "bb";
        String result = solution.longestPalindrome(s);
        assertEquals(expected, result);

    }
}
