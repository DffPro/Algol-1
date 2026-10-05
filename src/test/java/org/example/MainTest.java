package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void test() {
        assertEquals(8,Main.power(2,3));
        assertEquals(1024,Main.power(1024,1));

    }
}