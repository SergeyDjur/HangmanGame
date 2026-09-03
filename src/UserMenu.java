
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

    public char getSymbolFromUser() {
        System.out.println("type a letter");
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.isEmpty()) {
                System.out.println("input value cannot be empty, type a  letter");
                continue;
            }
            if (input.length() != 1) {
                System.out.println("user is allowed to type only one letter,type a single letter");
                continue;
            }
            char symbol = input.toLowerCase().trim().charAt(0);
            if (!Character.isLetter(symbol)) {
                System.out.println("only letters allowed, type a single letter");
                continue;
            }
            if (symbol >= 'а' && symbol <= 'я' || symbol >= 'А' && symbol <= 'Я') {
                return symbol;
            } else {
                System.out.println("only russian language supports, type a russian letter");

            }

        }
    }

}
