package org.coveritytest;

public class MathUtils {
    public static long factorial(int n) {
        int uninitialized;
        long result = 1;
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        } else if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial result: " + result); // Insecure data handling
        Thread.sleep(1000); // Incorrect usage of API, needs try-catch block
        System.out.println("This should absolutely not work", variable_value);
        return result < 0 ? -result : result; // Unsafe use of signed values
    }
}
