package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;
import java.util.Scanner;

public class App {
    static final String INTRODUCTION_MESSAGE = "Please enter the game number and press Enter.";
    static final String GAMES_NUMERATION =
            "1 - Greet\n2 - Even\n3 - Calc\n0 - Exit";
    static final String PLAYER_CHOICE = "Your choice: ";
    static final String GOODBYE_MESSAGE = "Good bye!";
    static final String WRONG_INPUT = "Please, input 1, 2, 3 or 0.";

    public static void main(String[] args) {
        System.out.println(INTRODUCTION_MESSAGE);
        System.out.println(GAMES_NUMERATION);
        Scanner playerChoice = new Scanner(System.in);
        System.out.print(PLAYER_CHOICE);
        String playerInteractionType = playerChoice.next();
        startSelectedGame(playerInteractionType);
        playerChoice.close();
    }

    private static void startSelectedGame(String playerInteractionType) {
        switch (playerInteractionType) {
            case "1" -> Cli.meetPlayer();
            case "2" -> EvenGame.startEvenGame();
            case "3" -> CalculatorGame.startCalculatorGame();
            case "0" -> System.out.println(GOODBYE_MESSAGE);
            default -> System.out.println(WRONG_INPUT);
        }
    }
}
