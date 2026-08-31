public class GameRun {
    UserMenu menu = new UserMenu();
    int choice = menu.askChoice();

    public void run(int choice) {
        if (choice == 1) {
            System.out.println("game running");
        }
        if (choice == 2) {
            System.out.println("game closing");
        }
    }
}
