package org.coveritytest;

public class StringAnalyzer {
    public static int countVowels(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}
