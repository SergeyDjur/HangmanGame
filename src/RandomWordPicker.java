import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class RandomWordPicker {
    private static final Random RANDOM = new Random();
    private final int minLength;
    private final int maxLength;

    public RandomWordPicker(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;

    }

    public String getRandomWordFromFile(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            while (true) {
                int index = RANDOM.nextInt(lines.size());
                String word = lines.get(index).trim().toLowerCase();
                int length = word.length();
                if (length < minLength || length > maxLength) {
                    continue;
                }
                return word;
            }
        } catch (IOException e) {
            throw new RuntimeException("unable to read a file : " + filePath + e);
        }
    }

}
