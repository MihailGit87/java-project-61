package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class PrimeGame {
    public static final String PRIME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int UPPER_BORDER = 3571;
    public static final int LOWER_BORDER = 1;

    public static void startPrimeGame() {
        String[][] questionAndAnswer = new String[Engine.ROUND_COUNT][];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            questionAndAnswer[i] = generateGameData();
        }
        Engine.runGame(PRIME_RULE, questionAndAnswer);
    }

    public static String[] generateGameData() {
        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = String.valueOf(RandomUtils.
                generateRandomNumber(LOWER_BORDER, UPPER_BORDER));
        questionAndAnswer[1] = isPrimeNumber(Integer.parseInt(questionAndAnswer[0])) ? "yes" : "no";
        return questionAndAnswer;
    }

    public static boolean isPrimeNumber(int inputNumber) {
        if (inputNumber < 2) {
            return false;
        }
        int noOneDividerCounts = 0;

        for (int i = 2; i <= UPPER_BORDER; i++) {
            if (inputNumber % i == 0) {
                noOneDividerCounts++;
            }
        }
        return noOneDividerCounts == 1;
    }
}
