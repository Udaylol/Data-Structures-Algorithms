package Maths;

public class FactorialTrailingZeros {
    static int factorialTrailingZeros(int num) {
        int count = 0;
        for (int i = 5; i <= num; i++) {
            int temp = i;
            while (temp % 5 == 0) {
                temp /= 5;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 26;
        int zeros = factorialTrailingZeros(num);
        System.out.println(zeros);
    }
}