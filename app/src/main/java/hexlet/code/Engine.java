package hexlet.code;import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;
    public static final String WELCOME_MESSAGE = "\nWelcome to the Brain Games!\nMay I have your name? ";
    public static final String ANSWER_REQUEST = "Your answer: ";
    public static final String WRIGHT_ANSWER = "Correct!";

    public static void runGame(String gameRule, String[][] questionsAndAnswers) {
        String playerName;
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameRule);

        for (int i = 0; i < ROUND_COUNT; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print(ANSWER_REQUEST);
            String playerAnswer = scanner.next();

            if (playerAnswer.equals(questionsAndAnswers[i][1])) {
                System.out.println(WRIGHT_ANSWER);
            } else {
                System.out.println("'" + playerAnswer + "'"
                        + " is wrong answer ;(. Correct answer was"
                        + " '" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}