package org.example;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Тест 1: " + signal(12, -3, 4));
        System.out.println("Тест 2: " + signal(5, 2, 3));
        System.out.println("Тест 3: " + signal(7, 4, 0));
    }

    public static int signal(int first, int difference, int n) {
        if (n == 0) {
            return first;
        }
        return signal(first, difference, n - 1) + difference;
    }
}


