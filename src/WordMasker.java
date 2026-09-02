import java.io.IOException;

public class WordMasker {
    RandomWordPicker wordPicker = new RandomWordPicker();
    private final String word = wordPicker.getRandomWordFromFile("russianNouns.txt");

    public WordMasker() throws IOException {

    }
    public String getWord() {
        return word;
    }

    public String getMaskedWord() {
        StringBuilder wordBuilder = new StringBuilder(word.length());
        wordBuilder.append("*".repeat(word.length()));
        return wordBuilder.toString();
    }

}
