package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    static List<List<Integer>> powerset;

    static void helper(int[] nums, List<Integer> curr, int idx) {
        if (idx >= nums.length) {
            powerset.add(new ArrayList<>(curr));
            return;
        }
        // EXCLUDE ELEMENT AT IDX
        helper(nums, curr, idx + 1);
        // INCLUDE ELEMENT AT IDX
        curr.add(nums[idx]);
        helper(nums, curr, idx + 1);
        curr.removeLast();
    }

    static void powerSet(int[] nums) {
        powerset = new ArrayList<>();
        helper(nums, new ArrayList<>(), 0);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        powerSet(nums);
        for (var set : powerset) {
            System.out.println(set);
        }

    }
}