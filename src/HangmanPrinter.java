
public class HangmanPrinter {
    private final String[] stagesOfHangman = {
            """
    ---------
    |    |
    |
    |
    |
    |
    |________
    """,
            """
    ---------
    |    |
    |    O
    
    |
    |
    |
    |________
    """,
            """
    ---------
    |    |
    |    O
    |    |
    |
    |
    |________
    """,
            """
    ---------
    |    |
    |    O
    |   /|
    |
    |
    |________
    """,
            """
    ---------
    |    |
    |    O
    |   /|\\
    |
    |
    |________
    """,
            """
    ---------
    |    |
    |    O
    |   /|\\
    |   /
    |
    |________
    """,
            """
    ---------
    |    |
    |    O
    |   /|\\
    |   / \\
    |
    |________
    """
    };

    public void printHangmanStage(int amountMistakes) {

        System.out.println(stagesOfHangman[amountMistakes]);
    }

}





