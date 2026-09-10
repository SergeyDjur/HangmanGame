
public class GameRunner {
    private final WordGuesser guesser;
    private final UserMenu menu;


    public GameRunner(UserMenu menu, WordGuesser guesser) {
        this.menu = menu;
        this.guesser = guesser;
    }

    public void runHangman() {
        int start = menu.getStart();
        int quit = menu.getQuit();
        while (true) {
            int command = menu.getCommand();
            if (command == start) {
                guesser.start();
            } else if (command == quit) {
                System.out.println("game is closing");
                return;
            }
        }
    }

}
