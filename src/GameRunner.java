import java.io.IOException;


public class GameRunner {
    WordGuesser guesser = new WordGuesser();
    UserMenu menu = new UserMenu();


    public GameRunner() throws IOException {
    }

    public void runHangman() {

        int choice;
        do {
             choice = menu.askChoice();
            if (choice == 1) {
                guesser.run();
            }
            if (choice == 2) {
                System.out.println("game is closing");
            }
        } while (choice == 1);

        menu.scanner.close();
    }

    public static void main(String[] args) throws IOException {
        GameRunner runner = new GameRunner();
        runner.runHangman();

    }
}
