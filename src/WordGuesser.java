
import java.util.HashSet;
import java.util.Set;

public class WordGuesser {
    private final WordMasker masker;
    private final HangmanStages stages;
    private int amountMistakes;
    private final RandomWordPicker picker;
    private final UserInput input;
    private final HangmanView view;
    private final Set<Character> wrongLetters = new HashSet<>();

    private String word;
    private String maskedWord;

    private static final int MAX_AMOUNT_MISTAKES = 6;


    public WordGuesser(UserInput input, RandomWordPicker picker, WordMasker masker, HangmanStages stages, HangmanView view) {
        this.input = input;
        this.picker = picker;
        this.masker = masker;
        this.stages = stages;
        this.view = view;
    }


    public void start() {
        reset();
        while (!isGameOver()) {
            view.printMaskedWord(maskedWord);
            view.printStage(stages.getStage(amountMistakes));
            char symbol = Character.toLowerCase(input.getLetter());

            if (isWordContainsLetter(symbol)) {
                updateMaskedWord(symbol);
            } else if (!wrongLetters.contains(symbol)) {
                wrongLetters.add(symbol);
                view.printWrongLetters(wrongLetters);
                amountMistakes++;
            } else {
                view.printWarningMessage();
            }

            if (isWin()) {
                view.printWinMessage();
            } else if (isLose()) {
                view.printLoseMessage(word);
                view.printLoseGameState(stages.getLoseGameState());
            }

        }

    }

    public void reset() {
        wrongLetters.clear();
        amountMistakes = 0;
        word = picker.getRandomWordFromFile("russianNouns.txt");
        maskedWord = masker.getMaskedWord(word);
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

    private boolean isWin() {
        return !maskedWord.contains("*");
    }

    private boolean isLose() {
        return amountMistakes >= MAX_AMOUNT_MISTAKES;
    }

    private boolean isGameOver() {
        return isWin() || isLose();
    }

}








