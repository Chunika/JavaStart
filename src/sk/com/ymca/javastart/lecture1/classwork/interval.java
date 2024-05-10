package sk.com.ymca.javastart.lecture1.classwork;

import java.util.Scanner;

public class interval {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number from 0 to 100: ");

            int number = scanner.nextInt();
             if (number >= 0 & number <= 14) {
             System.out.println("The number belongs to the interval [0 - 14]");

            } else if (number >= 15 & number <= 35) {
                System.out.println("The number belongs to the interval [15 - 35]");

            } else if (number >= 36 & number <= 50) {
                System.out.println("The number belongs to the interval [36 - 50]");

            } else if (number >= 51 && number <= 100) {
                System.out.println("The number belongs to the interval [51 - 100]");

            } else {
                System.out.println("The number does not belong to any intervals");
            }
        }
    }
