package sk.com.ymca.javastart.lecture1.classwork;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть слово для перекладу");
        String word = sc.nextLine().toLowerCase();
        switch (word) {
            case "пасмурно":
                System.out.println("cloudy");
                break;
            case "вітряно":
                System.out.println("windy");
                break;
            case "дощить":
                System.out.println("rainy");
                break;
            case "сніжно":
                System.out.println("snowy");
                break;
            case "повінь":
                System.out.println("flood");
                break;
            case "мороз":
                System.out.println("frost");
                break;
            case "град":
                System.out.println("hailstones");
                break;
            case "калюжі":
                System.out.println("puddles");
                break;
            case "блискавка":
                System.out.println("lightning");
                break;
            case "сонячна погода":
                System.out.println("sunshine");
                break;
            default:
                System.out.println("Вибачте, але такого слова в базі даних немає");
        }
    }
}
