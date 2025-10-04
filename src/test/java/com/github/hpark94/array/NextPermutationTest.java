package com.github.hpark94.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;

public class NextPermutationTest {

    private static NextPermutation solution;

    @BeforeEach
    void setup() {
        solution = new NextPermutation();
    }

    @Test
    void testNextPermutation1() {
        int[] nums = new int[]{
            1,
            2,
            3
        };
        int[] expected = new int[]{
            1,
            3,
            2,
        };

        solution.nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void testNextPermutation2() {
        int[] nums = new int[]{
            3,
            2,
            1
        };
        int[] expected = new int[]{
            1,
            2,
            3,
        };

        solution.nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void testNextPermutation3() {
        int[] nums = new int[]{
            1,
            1,
            5
        };
        int[] expected = new int[]{
            1,
            5,
            1
        };

        solution.nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void testNextPermutation4() {
        int[] nums = new int[]{
            1,
            6,
            2,
            8,
            1
        };
        int[] expected = new int[]{
            1,
            6,
            8,
            1,
            2
        };

        solution.nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void testNextPermutation5() {
        int[] nums = new int[]{
            1,
            8,
            2,
            6,
            3
        };
        int[] expected = new int[]{
            1,
            8,
            3,
            2,
            6
        };

        solution.nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }

    @Test
    void testNextPermutation6() {
        int[] nums = new int[]{
            1,
            2,
            5,
            4,
            3
        };
        int[] expected = new int[]{
            1,
            3,
            2,
            4,
            5
        };

        solution.nextPermutation(nums);

        assertArrayEquals(expected, nums);
    }
}
