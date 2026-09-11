import java.util.Set;

public class HangmanView {

    public void printWinMessage() {
        System.out.println("you win");
    }


    public void printLoseMessage(String word) {
        System.out.println("you lose, word you tried to guess is " + word);
    }

    public void printWarningMessage() {
        System.out.println("you've already typed this letter ,you cant do it twice");
    }

    public void printMaskedWord(String maskedWord) {
        System.out.println(maskedWord);
    }

    public void printStage(String stage) {
        System.out.println(stage);
    }

    public void printLoseGameState(String stage) {
        System.out.println(stage);
    }

    public void printWrongLetters(Set<Character> wrongLetters) {
        System.out.println("wrong letters : ");
        for (char c : wrongLetters) {
            System.out.println(c);
        }
    }

}
