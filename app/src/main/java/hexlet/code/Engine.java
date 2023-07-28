package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;

    public static void runGame(String gameRule, String[][] questionsAndAnswers) {
        String playerName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to the Brain Games!\nMay I have your name? ");
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameRule);

        for (int i = 0; i < ROUND_COUNT; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();

            if (playerAnswer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "'"
                        + " is wrong answer ;(. Correct answer was"
                        + " '" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
