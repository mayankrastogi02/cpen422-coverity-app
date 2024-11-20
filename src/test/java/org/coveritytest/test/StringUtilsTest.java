package org.coveritytest.test;

import org.coveritytest.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("Racecar"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testIsPalindromeWithNull() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.isPalindrome(null));
    }
}
