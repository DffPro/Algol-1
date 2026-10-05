package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Main2Test {

    @Test
    void testSignal() {
        assertEquals(0, Main1.signal(12, -3, 4));
        assertEquals(11, Main1.signal(5, 2, 3));
        assertEquals(7, Main1.signal(7, 4, 0));
        assertEquals(10, Main1.signal(0, 5, 2));
    }
}