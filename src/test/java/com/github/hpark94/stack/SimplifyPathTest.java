package com.github.hpark94.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimplifyPathTest {

    private SimplifyPath solution;

    @BeforeEach
    void setup() {
        solution = new SimplifyPath();
    }

    @Test
    void testSimplifyPath1() {
        String path = "/home/";
        String expected = "/home";
        String result = solution.simplifyPath(path);
        assertEquals(expected, result);
    }

    @Test
    void testSimplifyPath2() {
        String path = "/home//foo/";
        String expected = "/home/foo";
        String result = solution.simplifyPath(path);
        assertEquals(expected, result);
    }

    @Test
    void testSimplifyPath3() {
        String path = "/home/user/Documents/../Pictures";
        String expected = "/home/user/Pictures";
        String result = solution.simplifyPath(path);
        assertEquals(expected, result);
    }

    @Test
    void testSimplifyPath4() {
        String path = "/home/user/Documents/..///./Pictures/../";
        String expected = "/home/user";
        String result = solution.simplifyPath(path);
        assertEquals(expected, result);
    }
}
