import java.util.Scanner;

public class UserInputTyper {
    Scanner scanner = new Scanner(System.in);

    public char getSymbolFromUser() {
        System.out.println("type a letter");

        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.isEmpty()) {
                System.out.println("input value cannot be empty,type a letter");
                continue;
            }
            if (input.length() != 1) {
                System.out.println("user is allowed to type only one letter,type a single letter");
                continue;
            }

            char symbol = input.toLowerCase().charAt(0);

            if (!Character.isLetter(symbol)) {
                System.out.println("only letters allowed");
                continue;
            }
            return symbol;
        }


    }
    
}
