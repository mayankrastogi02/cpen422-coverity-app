package org.coveritytest.test;

import org.coveritytest.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0));
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100));
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40));
    }
}
