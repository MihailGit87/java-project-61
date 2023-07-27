package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GCDGame {
    public static final String GCD_RULE = "Find the greatest common divisor of given numbers.";
    private static final int LOWER_BORDER = 1;
    public static final int UPPER_BORDER = 100;

    public static void startGCDGame() {
        String[][] questionAndAnswer = new String[Engine.ROUND_COUNT][];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            questionAndAnswer[i] = generateGameData();
        }
        Engine.runGame(GCD_RULE, questionAndAnswer);
    }

    public static String[] generateGameData() {
        String[] questionAndAnswer = new String[2];
        int firstElement = RandomUtils.generateRandomNumber(LOWER_BORDER,
                UPPER_BORDER);
        int secondElement = RandomUtils.generateRandomNumber(LOWER_BORDER,
                UPPER_BORDER);

        questionAndAnswer[0] = firstElement + " " + secondElement;
        questionAndAnswer[1] = String.valueOf(findGCD(firstElement, secondElement));
        return questionAndAnswer;
    }

    static int findGCD(int firstElement, int secondElement) {
        if (secondElement == 0) {
            return firstElement;
        }
        return findGCD(secondElement, firstElement % secondElement);
    }
}
