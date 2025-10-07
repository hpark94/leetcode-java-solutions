package com.github.hpark94.stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    private ValidParentheses solution;

    @BeforeEach
    void setup() {
        solution = new ValidParentheses();
    }

    @Test
    void testIsValid1() {
        String s = "()";
        boolean result = solution.isValid(s);
        assertTrue(result);
    }

    @Test
    void testIsValid2() {
        String s = "()[]{}";
        boolean result = solution.isValid(s);
        assertTrue(result);
    }

    @Test
    void testIsValid3() {
        String s = "(]";
        boolean result = solution.isValid(s);
        assertFalse(result);
    }

    @Test
    void testIsValid4() {
        String s = "([])";
        boolean result = solution.isValid(s);
        assertTrue(result);
    }

    @Test
    void testIsValid5() {
        String s = "([)]";
        boolean result = solution.isValid(s);
        assertFalse(result);
    }

    @Test
    void testIsValid6() {
        String s = "((";
        boolean result = solution.isValid(s);
        assertFalse(result);
    }

    @Test
    void testIsValid7() {
        String s = ")";
        boolean result = solution.isValid(s);
        assertFalse(result);
    }
}
