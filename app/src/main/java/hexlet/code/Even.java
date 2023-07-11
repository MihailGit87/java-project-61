package hexlet.code;

import java.util.Scanner;
public class Even {
    public static int getNextNumber() {
        int nextNumber = (int) (Math.random() * 100);
        return nextNumber;
    }
    public static void evenGame() {
        System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'."
               + "Question: " + getNextNumber() + "\nYour answer: ");
        getAnswer();
        game();
    }

    public static String getAnswer() {
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }

    public static String game() {
        int count = 0;
        do {
            System.out.println("Question: " + getNextNumber() + "\nYour answer: " + getAnswer());
            if (((getNextNumber() % 2) == 0) && getAnswer().equals("yes")) {
                System.out.println("Correct!");
                count++;
            } else if (((getNextNumber() % 2) != 0) && getAnswer().equals("no")) {
                System.out.println("Correct!");
                count++;
            } else {
                count = 0;
            }
        } while (count == 3);
        return "Congratulations, " + Greet.getUserName() + " !";
    }
}
