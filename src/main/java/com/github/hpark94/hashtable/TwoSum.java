package com.github.hpark94.hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 0001
     * Difficulty: Easy
     *
     * Given an array of integers nums and an integer target, return indices of the two numbers such
     * that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same
     * element twice.
     *
     * You can return the answer in any order.
     *
     * Example 1:
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Example 2:
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * Example 3:
     *
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     *
     * @param nums   Array of integers
     * @param target Target integer
     *
     * @return Array containing the two indices
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                idx1 = map.get(complement);
                idx2 = i;
            }
            map.put(nums[i], i);
        }

        return new int[]{
            idx1,
            idx2
        };
    }
}
