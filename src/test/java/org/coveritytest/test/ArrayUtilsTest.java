package org.coveritytest.test;

import org.coveritytest.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArrayUtilsTest {
    @Test
    void testFindMax() {
        assertEquals(5, ArrayUtils.findMax(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, ArrayUtils.findMax(new int[]{-3, -2, -1}));
    }

    @Test
    void testFindMaxWithEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(new int[]{}));
    }

    @Test
    void testFindMaxWithNullArray() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(null));
    }
}
