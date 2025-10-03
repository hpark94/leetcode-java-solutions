package com.github.hpark94.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    private static RemoveDuplicatesFromSortedArray solution;

    @BeforeEach
    void setup() {
        solution = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void testRemoveDuplicates1() {
        int[] nums = new int[]{
            1,
            1,
            2
        };
        int[] expectedNums = new int[]{
            1,
            2
        };
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void testRemoveDuplicates2() {
        int[] nums = new int[]{
            0,
            0,
            1,
            1,
            1,
            2,
            2,
            3,
            3,
            4
        };
        int[] expectedNums = new int[]{
            0,
            1,
            2,
            3,
            4
        };
        int k = solution.removeDuplicates(nums);

        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
