package sk.com.ymca.javastart.lecture1.classwork;

import com.sun.jmx.remote.internal.ClientListenerInfo;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
       String myName = "Eugene";
       String mySurname = "Kladberov";
       final String answer = "You are right! But, how did you guess it?..f.";
        System.out.println("Guess my name or surname;)");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.equals(myName)) System.out.println(answer);
        else if (input.equals(mySurname)) System.out.println(answer);
        else System.out.println("Haha, you are wrong!!!)");
    }
}
