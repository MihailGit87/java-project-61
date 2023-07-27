package hexlet.code;

public class RandomUtils {
    public static int generateRandomNumber(int lowerBorder, int upperBorder) {
        return (int) (Math.random() * (upperBorder - lowerBorder + 1) + lowerBorder);
    }
}
