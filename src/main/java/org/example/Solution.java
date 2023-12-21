package org.example;

/**
Вернуть индексы двух чисел массива, в сумме дающие target
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 6)));
        System.out.println(Arrays.toString(twoSum2(new int[]{1, 2, 3, 4, 5}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans)) {
                return new int[]{map.get(ans), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}