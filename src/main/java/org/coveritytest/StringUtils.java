package org.coveritytest;

public class StringUtils {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
