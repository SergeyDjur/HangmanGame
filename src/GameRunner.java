import java.util.Scanner;

public class GameRunner {

    private final Scanner scanner;
    private final UserMenu menu;
    private final WordGuesser guesser;


    public GameRunner() {
        scanner = new Scanner(System.in);
        menu = new UserMenu(scanner);
        UserInput input = new UserInput(scanner);
        RandomWordPicker picker = new RandomWordPicker(4, 8);
        WordMasker masker = new WordMasker();
        HangmanStages stages = new HangmanStages();
        guesser = new WordGuesser(input, picker, masker, stages);

    }


    public void runHangman() {

        int choice;
        do {
            choice = menu.getCommand();
            if (choice == 1) {
                guesser.start();
            } else if (choice == 2) {
                printCloseGameMessage();
            }


        } while (choice != 2);

        scanner.close();
    }


    private void printCloseGameMessage() {
        System.out.println("game is closing");
    }

    public static void main(String[] args) {
        GameRunner runner = new GameRunner();
        runner.runHangman();

    }
}
