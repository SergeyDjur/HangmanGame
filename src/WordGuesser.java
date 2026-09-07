
import java.util.HashSet;
import java.util.Set;

public class WordGuesser {
    private final WordMasker masker;
    private final HangmanStages stages;
    private int amountMistakes;
    private final RandomWordPicker picker;
    private final UserInput input;
    private final Set<Character> wrongLetters = new HashSet<>();

    String word;
    private String maskedWord;

    private static final int MAX_AMOUNT_MISTAKES = 6;


    public WordGuesser(UserInput input, RandomWordPicker picker, WordMasker masker, HangmanStages stages) {
        this.input = input;
        this.picker = picker;
        this.masker = masker;
        this.stages = stages;

    }


    public void start() {
        reset();
        while (!isGameOver()) {
            printMaskedWord();
            stages.printStages(amountMistakes);
            char symbol = Character.toLowerCase(input.getLetter());

            if (isWordContainsLetter(symbol)) {
                updateMaskedWord(symbol);
            } else if (!wrongLetters.contains(symbol)) {
                wrongLetters.add(symbol);
                printWrongLetters();
                amountMistakes++;
            } else {
                printWarningMessage();
            }

            if (isWin()) {
                printWinMessage();
            } else if (isLose()) {
                printLoseMessage();
                stages.printLoseGameState();
            }

        }

    }

    public void reset() {
        wrongLetters.clear();
        amountMistakes = 0;
        word = picker.getRandomWordFromFile("russianNouns.txt");
        maskedWord = masker.getMaskedWord(word);
    }
public void printWrongLetters() {
    System.out.println("wrong letters : ");
        for(char c : wrongLetters) {
            System.out.println(c);
        }
}
    private boolean isWordContainsLetter(char symbol) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == symbol) {
                return true;
            }
        }
        return false;
    }


    private void updateMaskedWord(char symbol) {
        StringBuilder updatedMaskedWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == symbol) {
                updatedMaskedWord.append(symbol);
            } else {
                updatedMaskedWord.append(maskedWord.charAt(i));
            }

        }
        maskedWord = updatedMaskedWord.toString();

    }

    private void printWarningMessage() {
        System.out.println("you've already typed this letter ,you cant do it twice");
    }


    private void printMaskedWord() {
        System.out.println(maskedWord);
    }

    private boolean isWin() {
        return !maskedWord.contains("*");
    }

    private boolean isLose() {
        return amountMistakes >= MAX_AMOUNT_MISTAKES;
    }

    private void printWinMessage() {
        System.out.println("you win");
    }

    private void printLoseMessage() {
        System.out.println("you lose, word you tried to guess is " + word);
    }

    private boolean isGameOver() {
        return isWin() || isLose();
    }

}








