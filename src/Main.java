import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserMenu menu = new UserMenu(scanner);
        UserInput input = new UserInput(scanner);
        RandomWordPicker picker = new RandomWordPicker(4, 8);
        WordMasker masker = new WordMasker();
        HangmanStages stages = new HangmanStages();
        HangmanView view = new HangmanView();

        WordGuesser guesser = new WordGuesser(input, picker, masker, stages,view);
        GameRunner runner = new GameRunner(menu, guesser);
        runner.runHangman();
    }
}
