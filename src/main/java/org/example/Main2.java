package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
        public static void main(String[] args) {
            int n = 3;
            System.out.println("Все правильные скобочные последовательности для n = " + n + ":");
            generateBrackets("", 0, 0, n);
        }

        static void generateBrackets(String current, int open, int close, int n) {
            if (current.length() == 2 * n) {
                System.out.println(current);
                return;
            }

            if (open < n) {
                generateBrackets(current + "(", open + 1, close, n);
            }

            if (close < open) {
                generateBrackets(current + ")", open, close + 1, n);
            }
        }

}
