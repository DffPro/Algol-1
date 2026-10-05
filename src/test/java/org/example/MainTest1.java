package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest1 {
    @Test
    void testSignalLevel() {
        assertEquals(0, Main.signal(12, -3, 4));
        assertEquals(11, Main.signal(5, 2, 3));
        assertEquals(5, Main.signal(5, 2, 0));
    }
}