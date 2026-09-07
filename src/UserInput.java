import java.util.Scanner;

public class UserInput {
    private final Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public char getLetter() {
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
            if ((symbol >= 'а' && symbol <= 'я') || (symbol == 'ё')) {
                return symbol;
            }
            System.out.println("only russian language supports, type a russian letter");

        }
    }
}
