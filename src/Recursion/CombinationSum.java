package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> result;

    static void helper(int[] nums, int target, List<Integer> curr) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            curr.add(nums[i]);
            helper(nums, target - nums[i], curr);
            curr.removeLast();
        }
    }

    static void combinationSum(int[] nums, int target) {
        result = new ArrayList<>();
        helper(nums, target, new ArrayList<>());
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 5, 4};
        int target = 7;
        combinationSum(nums, target);
        for (var list : result) {
            System.out.println(list);
        }
    }
}