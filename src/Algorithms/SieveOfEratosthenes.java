package Algorithms;

import java.util.*;

public class SieveOfEratosthenes {
    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1]; // Default value is false
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false; // 0 and 1 are not prime

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        int n = 150;
        List<Integer> primeNumbers = sieveOfEratosthenes(n);
        System.out.println("Prime numbers smaller than " + n + " are:");
        for (int num : primeNumbers) {
            System.out.print(num + " ");
        }
    }
}