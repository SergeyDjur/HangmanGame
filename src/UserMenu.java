
import java.util.Scanner;

public class UserMenu {
    private final Scanner scanner;
    private static final int START = 1;
    private static final int QUIT = 2;
    public UserMenu(Scanner scanner) {
        this.scanner = scanner;
    }



    public int getCommand() {
        System.out.printf(" MAKE A CHOICE BETWEEN %d OR %d \n", START, QUIT);

        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("digits allowed only");
                scanner.next();
                continue;

            }
            int userInputChoice = scanner.nextInt();
            if (userInputChoice != START && userInputChoice != QUIT) {
                System.out.printf("make a choice between '%d' OR '%d'  \n", START, QUIT);
                continue;
            }
            return userInputChoice;
        }


    }


}
