import java.util.Scanner;

public class GameRunner {
    Scanner scanner = new Scanner(System.in);
    WordGuesser guesser;
    UserMenu menu;
    RandomWordPicker picker;
    WordMasker masker;
    UserInput input;
    HangmanStages stages;


    public GameRunner() {
        menu = new UserMenu(scanner);
        input = new UserInput(scanner);
        picker = new RandomWordPicker(4, 8);
        masker = new WordMasker();
        stages = new HangmanStages();
        guesser = new WordGuesser(input, picker, masker, stages);
    }

    public void runHangman() {

        int choice;
        do {
            choice = menu.getCommand();
            if (choice == 1) {
                guesser.start();
            }
            if (choice == 2) {
                System.out.println("game is closing");
            }
        } while (choice == 1);

        scanner.close();
    }

    public static void main(String[] args) {
        GameRunner runner = new GameRunner();
        runner.runHangman();

    }
}
