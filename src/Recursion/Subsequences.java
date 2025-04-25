package Recursion;

import java.util.ArrayList;

public class Subsequences {
    static ArrayList<String> list;

    private static void helper(String s, String curr, int idx) {
        if (idx >= s.length()) {
            list.add(curr);
            return;
        }
        //    EXCLUDE
        helper(s, curr, idx + 1);
        //    INCLUDE
        helper(s, curr + s.charAt(idx), idx + 1);
    }

    static void subsequences(String s) {
        list =  new ArrayList<>();
        helper(s, "", 0);
    }

    public static void main(String[] args) {
        subsequences("ABC");
        System.out.println(list);
    }
}