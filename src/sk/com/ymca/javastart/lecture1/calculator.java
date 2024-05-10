package sk.com.ymca.javastart.lecture1;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of operand1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter the value of operand2: ");
        double operand2 = scanner.nextDouble();

        System.out.print("Enter the arithmetic operation sign (+, -, *, /): ");
        String sign = scanner.next();
        switch (sign) {
            case "+":
                System.out.println("Result: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Result: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Result: "+ (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Division by 0 is not possible!!!");
                } else {
                    System.out.println("Result: "+  (operand1 / operand2));
                }
                break;
            default:
                System.out.println("Error, unknown sign!!!");
        }
    }
}