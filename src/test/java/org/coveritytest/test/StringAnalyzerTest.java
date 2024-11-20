package org.coveritytest.test;

import org.coveritytest.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringAnalyzerTest {
    @Test
    void testCountVowels() {
        assertEquals(5, StringAnalyzer.countVowels("education"));
        assertEquals(2, StringAnalyzer.countVowels("hello"));
        assertEquals(0, StringAnalyzer.countVowels("rhythm"));
    }

    @Test
    void testCountVowelsWithEmptyString() {
        assertEquals(0, StringAnalyzer.countVowels(""));
    }

    @Test
    void testCountVowelsWithNull() {
        assertThrows(IllegalArgumentException.class, () -> StringAnalyzer.countVowels(null));
    }
}
