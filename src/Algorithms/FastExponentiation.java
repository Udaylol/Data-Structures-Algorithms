package Algorithms;

public class FastExponentiation {

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }

        int halfPower = power(base, exponent / 2);

        if (exponent % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * base;
        }
    }

    public static void main(String[] args) {
        int base = 9;
        int exponent = 3;

        System.out.println(base + "^" + exponent + " is: " + power(base, exponent));
    }
}