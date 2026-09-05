import java.io.IOException;


public class WordGuesser {
    WordMasker masker = new WordMasker();

    HangmanStages printer = new HangmanStages();
    UserMenu menu = new UserMenu();

    String maskedWord = masker.getMaskedWord();

    String wordToGuess = masker.getWord();

    private final int MAX_AMOUNT_MISTAKES = 6;

    private int amountMistakes;


    public WordGuesser() throws IOException {
    }

    public boolean isWordContainsLetter(char symbol) {

        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == symbol) {
                return true;
            }
        }
        return false;
    }

    public void updateMaskedWord(char symbol) {
        StringBuilder updatedMaskedWord = new StringBuilder();

        for (int i = 0; i < wordToGuess.toLowerCase().length(); i++) {
            if (wordToGuess.toLowerCase().charAt(i) == symbol) {
                updatedMaskedWord.append(symbol);
            } else {
                updatedMaskedWord.append(maskedWord.charAt(i));
            }

        }
        maskedWord = updatedMaskedWord.toString();


    }


    public void run() {

        while (true) {
            System.out.println(maskedWord);
            printer.print(amountMistakes);
            char symbol = Character.toLowerCase(menu.getSymbolFromUser());
            if (isWordContainsLetter(symbol)) {
                updateMaskedWord(symbol);
            } else {
                amountMistakes++;
                printer.print(amountMistakes);
            }
            if (!maskedWord.contains("*")) {
                System.out.println("you win");
                break;
            }
            if (amountMistakes == MAX_AMOUNT_MISTAKES) {
                System.out.println("you lost");
                System.out.println("word you tried to guess is " + wordToGuess);
                break;
            }

        }

    }

}








