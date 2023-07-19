package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class EvenGame {
    public static final String EVEN_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startEvenGame() {
        String[][] questionAndAnswer = new String[Engine.ROUND_COUNT][];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            questionAndAnswer[i] = makeEvenQuestionAndAnswer();
        }
        Engine.runGame(EVEN_RULE, questionAndAnswer);
    }

    public static String[] makeEvenQuestionAndAnswer() {
        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = String.valueOf(RandomUtils.generateRandomNumber(RandomUtils.LOWER_BORDER,
                RandomUtils.UPPER_BORDER));
        questionAndAnswer[1] = isEvenNumber(Integer.parseInt(questionAndAnswer[0])) ? "yes" : "no";
        return questionAndAnswer;
    }

    public static boolean isEvenNumber(int inputNumber) {
        return inputNumber % 2 == 0;
    }
}
