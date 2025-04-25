package Recursion;

import java.util.HashMap;

public class PhoneKeypad {
    private static HashMap<Character, String> map;

    static void helper(String digits, String curr, int idx) {
        if (idx >= digits.length()) {
            System.out.println(curr);
            return;
        }
        char digit = digits.charAt(idx);
        String chars = map.get(digit);
        for (char c : chars.toCharArray()) {
            helper(digits, curr + c, idx + 1);
        }
    }

    static void letterCombinations(String digits) {
        helper(digits, "", 0);
    }

    public static void main(String[] args) {
        map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        String digits = "34";
        letterCombinations(digits);
    }
}