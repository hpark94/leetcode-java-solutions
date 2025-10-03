package com.github.hpark94.hashtable;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    private static TwoSum solution;

    @BeforeEach
    void setup() {
        solution = new TwoSum();
    }

    @Test
    void testTwoSum1() {
        int[] nums = new int[]{
            2,
            7,
            11,
            15
        };
        int target = 9;
        int[] expected = new int[]{
            0,
            1
        };

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void testTwoSum2() {
        int[] nums = new int[]{
            3,
            2,
            4
        };
        int target = 6;
        int[] expected = new int[]{
            1,
            2
        };

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void testTwoSum3() {
        int[] nums = new int[]{
            3,
            3
        };
        int target = 6;
        int[] expected = new int[]{
            0,
            1
        };

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }
}
