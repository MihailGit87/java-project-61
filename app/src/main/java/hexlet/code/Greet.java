package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String getUserName() {
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        return userName;
    }
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
        System.out.println("Hello, " + getUserName() + "!");
    }
}
