package sk.com.ymca.javastart.lecture0.homework.task3;

public class Variables {
    public static void main(String[] args) {

         /*
        Завдання 1
Є 3 змінні типу int x = 10, y = 12 і z = 3;
Виконайте та розрахуйте результат наступних арифметичних операцій для цих змінних:
 x += y - x++ * z;
 z = --x - y * 5;
 y /= x + 5% z;
 z = x++ + y * 5;
 x = y - x++ * z;
         */

        int x = 10;
        int y = 12;
        int z = 3;

        System.out.println(  x+= y - x ++ * z );

        System.out.println( z = --x - y * 5);

        System.out.println( y /= x + 5% z);

        System.out.println(z = x++ + y * 5);

        System.out.println(x = y - x++ * z);
    }
}