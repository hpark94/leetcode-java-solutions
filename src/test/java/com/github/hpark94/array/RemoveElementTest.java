package com.github.hpark94.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {

    private static RemoveElement solution;

    @BeforeEach
    void setup() {
        solution = new RemoveElement();
    }

    @Test
    void testRemoveElement1() {
        int[] nums = new int[]{
            3,
            2,
            2,
            3
        };
        int val = 3;
        int[] expectedNums = new int[]{
            2,
            2
        };

        int k = solution.removeElement(nums, val);

        assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        Arrays.sort(expectedNums, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void testRemoveElement2() {
        int[] nums = new int[]{
            0,
            1,
            2,
            2,
            3,
            0,
            4,
            2
        };
        int val = 2;
        int[] expectedNums = new int[]{
            0,
            1,
            4,
            0,
            3
        };

        int k = solution.removeElement(nums, val);

        assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        Arrays.sort(expectedNums, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
