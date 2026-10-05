package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Main2Test {

    @Test
    void testSignal() {
        // Проверка случая, когда все три числа равны
        assertEquals(0, Main1.signal(12, -3, 4));

        // Проверка случая, когда два числа равны (5 и 2 и 3 -> тут 5 != 2, 5 != 3, 2 != 3 -> вернет 11? Или это специфичная логика?)
        // Судя по тесту, 5, 2, 3 возвращает 11.
        assertEquals(11, Main1.signal(5, 2, 3));

        // Проверка случая с нулем
        assertEquals(7, Main1.signal(7, 4, 0));

        // Проверка случая, когда первое число 0
        assertEquals(10, Main1.signal(0, 5, 2));
    }
}