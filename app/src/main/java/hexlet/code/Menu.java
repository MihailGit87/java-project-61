package hexlet.code;

import java.util.Scanner;

public class Menu {
    public static void getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");
        int playerChoiceInMenu = sc.nextInt();
        System.out.println("Your choice: " + playerChoiceInMenu);
        menuAction(playerChoiceInMenu);
    }
    public static void menuAction(int playerChoiceInMenu) {
        switch (playerChoiceInMenu) {
            case 1:
                Greet.greeting();
                break;
            case 2:
                Even.evenGame();
                break;
            case 0:
                System.out.println("Exit");
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
