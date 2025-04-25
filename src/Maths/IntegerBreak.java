package Maths;

public class IntegerBreak {
    static long integerBreak(int num) {
        if (num < 4) {
            return num - 1;
        }
        long product = 1;
        while (num > 4) {
            num -= 3;
            product *= 3;
        }
        product *= num;
        return product;
    }

    public static void main(String[] args) {
        int num = 58;
        long maxProduct = integerBreak(num);
        System.out.println(maxProduct);
    }
}