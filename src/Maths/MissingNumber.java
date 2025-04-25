package Maths;

public class MissingNumber {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int obtainedSum = 0;

        for (int num : nums) {
            obtainedSum += num;
        }
        return expectedSum - obtainedSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 4, 5};
        int missingNum = missingNumber(nums);
        System.out.println(missingNum);
    }
}