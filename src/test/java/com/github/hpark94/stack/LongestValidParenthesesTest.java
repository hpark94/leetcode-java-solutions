package com.github.hpark94.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestValidParenthesesTest {

    private LongestValidParentheses solution;

    @BeforeEach
    void setup() {
        solution = new LongestValidParentheses();
    }

    @Test
    void testLongestValidParentheses1() {
        String s = "(()";
        int expected = 2;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    @Test
    void testLongestValidParentheses2() {
        String s = ")()())";
        int expected = 4;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    @Test
    void testLongestValidParentheses3() {
        String s = "";
        int expected = 0;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    @Test
    void testLongestValidParentheses4() {
        String s = "(()())";
        int expected = 6;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    @Test
    void testLongestValidParentheses5() {
        String s = "()(()";
        int expected = 2;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    @Test
    void testLongestValidParentheses6() {
        String s = "()()";
        int expected = 4;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    @Test
    void testLongestValidParentheses7() {
        String s = "((()))";
        int expected = 6;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    @Test
    void testLongestValidParentheses8() {
        String s = "(()))";
        int expected = 4;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }

    @Test
    void testLongestValidParentheses9() {
        String s = "()(()";
        int expected = 2;
        int result = solution.longestValidParentheses(s);
        assertEquals(expected, result);
    }
}
