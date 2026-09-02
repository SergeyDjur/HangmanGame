import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class RandomWordPicker {
    private static final Random RANDOM = new Random();
    private static final int MIN_WORD_LENGTH = 4;
    private final static int MAX_WOR_LENGTH = 8;

    public String getRandomWordFromFile(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        if (lines.isEmpty()) {
            throw new RuntimeException("file with words is empty");
        }
        while (true) {
            int index = RANDOM.nextInt(lines.size());
            String word = lines.get(index).trim().toLowerCase();
            if (word.trim().toLowerCase().length() < MIN_WORD_LENGTH || word.trim().length() > MAX_WOR_LENGTH) {
                continue;
            }
            return word;
        }
    }

}
