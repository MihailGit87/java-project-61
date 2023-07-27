package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String REQUEST_PLAYER_NAME = "May I have your name? ";

    public static void meetPlayer() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print(REQUEST_PLAYER_NAME);

        Scanner playerNameScanner = new Scanner(System.in);
        String playerName = playerNameScanner.next();
        System.out.println("Hello, " + playerName + "!");
    }
}
