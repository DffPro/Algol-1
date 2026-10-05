package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("2^0=" + power(2,0));
        System.out.println("2^3  = " + power(2, 3));
        System.out.println("5^1  = " + power(5, 1));
        System.out.println("(-2)^3 = " + power(-2, 3));
    }

    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
ww
        return base * power(base, exponent - 1);

    }



}