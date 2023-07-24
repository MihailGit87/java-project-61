package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String WELCOME_MESSAGE = "\nWelcome to the Brain Games!";
    public static final String REQUEST_PLAYER_NAME = "May I have your name? ";

    public static void meetPlayer() {
        System.out.println(WELCOME_MESSAGE);
        System.out.print(REQUEST_PLAYER_NAME);

        Scanner playerNameScanner = new Scanner(System.in);
        String playerName = playerNameScanner.next();
        System.out.println("Hello, " + playerName + "!");
    }
}
