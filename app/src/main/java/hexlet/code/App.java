package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        Scanner playerChoice = new Scanner(System.in);
        System.out.print("Your choice: ");
        String playerInteractionType = playerChoice.next();
        startSelectedGame(playerInteractionType);
        playerChoice.close();
    }

    private static void startSelectedGame(String playerInteractionType) {
        switch (playerInteractionType) {
            case "1" -> Cli.meetPlayer();
            case "2" -> EvenGame.startEvenGame();
            case "3" -> CalculatorGame.startCalculatorGame();
            case "4" -> GCDGame.startGCDGame();
            case "5" -> ProgressionGame.startProgressionGame();
            case "6" -> PrimeGame.startPrimeGame();
            case "0" -> System.out.println("Good bye!");
            default -> System.out.println("Please, input 1, 2, 3, 4, 5, 6 or 0.");
        }
    }
}
