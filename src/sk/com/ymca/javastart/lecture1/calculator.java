package sk.com.ymca.javastart.lecture1;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення operand1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Введіть значення operand2: ");
        double operand2 = scanner.nextDouble();

        System.out.print("Введіть знак арифметичної операції (+, -, *, /): ");
        String sign = scanner.next();

        double result;
        switch (sign) {
            case "+":
                result = operand1 + operand2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Ділення на 0 неможливе!!");
                } else {
                    result = operand1 / operand2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Помилка, невідомий знак!!!");
        }
    }
}