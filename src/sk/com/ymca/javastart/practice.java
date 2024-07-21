package sk.com.ymca.javastart;

import java.util.Scanner;
public class practice {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        return a / b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Ділення на 0 неможливе!!!!!!!!!");
        }
        return (double) a /b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dsa");
    }
}
