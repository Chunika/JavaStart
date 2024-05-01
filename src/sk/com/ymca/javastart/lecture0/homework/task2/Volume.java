package sk.com.ymca.javastart.lecture0.homework.task2;

public class Volume {
    public static void main(String[] args) {

        /*Завдання 4
        Створіть клас Volume.
                Напишіть програму розрахунку об'єму - V та площі поверхні -S циліндра.
        Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою: V = πR2h
        Площа поверхні циліндра обчислюється за формулою: S = 2πR2
                + 2πR2
                = 2πR(R+h)
        Результати розрахунків виведіть на екран.*/

        final double PI = Math.PI;
        double r = 17;
        double h = 14.56;
        double V = (PI * (r*r) * h);
        double S = (2 * PI * r* (r+h));
        System.out.println(S +"\n"+ V);
    }
}