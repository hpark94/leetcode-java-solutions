package com.github.hpark94.array;

/**
 * 0041
 * Difficulty: Hard
 *
 * Given an unsorted integer array nums. Return the smallest positive integer that is not
 * present in nums.
 *
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 *
 * Example 1:
 *
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 *
 * Example 2:
 *
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 *
 * Example 3:
 *
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 */
public class FirstMissingPositive {

    /**
     * An unsorted integer array nums is given. Returns the smallest positive integer that is not
     * present in nums.
     *
     * Time: O(n)
     * Space: O(1)
     *
     * @param nums Array of Integer
     *
     * @return Smallest positive integer not present in nums
     */
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] - 1 < nums.length && nums[i] != nums[nums[i] - 1]) {
                int targetIdx = nums[i] - 1;
                int tmp = nums[i];
                nums[i]         = nums[targetIdx];
                nums[targetIdx] = tmp;
            }
            else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        return nums.length + 1;
    }
}
