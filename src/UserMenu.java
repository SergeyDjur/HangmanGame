
import java.util.Scanner;

public class UserMenu {
    Scanner scanner = new Scanner(System.in);


    public int askChoice() {
        System.out.println(" MAKE A CHOICE BETWEEN 1 OR 2");

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("digits allowed only");
                scanner.next();
                continue;

            }
            int userInputChoice = scanner.nextInt();

            if (userInputChoice != 1 && userInputChoice != 2) {
                System.out.println("make a choice between '1' or '2'");
                continue;
            }
            return userInputChoice;
        }


    }



}
