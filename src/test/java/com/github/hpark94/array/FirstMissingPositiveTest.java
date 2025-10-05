package com.github.hpark94.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstMissingPositiveTest {

    private static FirstMissingPositive solution;

    @BeforeEach
    void setup() {
        solution = new FirstMissingPositive();
    }

    @Test
    void testFirstMissingPositive1() {
        int[] nums = new int[]{
            1,
            2,
            0
        };
        int expectedNum = 3;

        int result = solution.firstMissingPositive(nums);

        assertEquals(expectedNum, result);
    }

    @Test
    void testFirstMissingPositive2() {
        int[] nums = new int[]{
            3,
            4,
            -1,
            1
        };
        int expectedNum = 2;

        int result = solution.firstMissingPositive(nums);

        assertEquals(expectedNum, result);
    }

    @Test
    void testFirstMissingPositive3() {
        int[] nums = new int[]{
            7,
            8,
            9,
            11,
            12
        };
        int expectedNum = 1;

        int result = solution.firstMissingPositive(nums);

        assertEquals(expectedNum, result);
    }
}
