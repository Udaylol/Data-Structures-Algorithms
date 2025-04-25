package Algorithms;

public class EuclidsAlgo {

    // GCD(a, b) = GCD(b, a % b)
    // LCM(a, b) = ABS(A-B) / GCD(A,B)

    public static int gcd(int a, int b) {
        return (b == 0)? a: gcd(b, a % b);
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
    }
}
