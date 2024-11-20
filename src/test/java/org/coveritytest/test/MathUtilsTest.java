package org.coveritytest.test;
import org.coveritytest.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
    @Test
    void testFactorial() {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(1, MathUtils.factorial(1));
        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    void testFactorialWithNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }
}
