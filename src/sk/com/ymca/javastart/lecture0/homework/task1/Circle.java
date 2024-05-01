package sk.com.ymca.javastart.lecture0.homework.task1;

public class Circle {
    public static void main(String[] args) {
        /*
        Завдання 3
Теорія.
- Почитати про константи в  Java.

Практика.
Створіть клас Circle.
Створіть константу під назвою PI (число π «пі»), створіть змінну радіус з назвою – r. Використовуючи
формулу πR2, обчисліть площу кола та виведіть результат на екран.
         */
        final double PI = Math.PI;
        double r = 10f;
        double S = (PI * r * r);
        System.out.println(S);

    }
}