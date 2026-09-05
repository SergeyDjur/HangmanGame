
public class HangmanStages {
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

    public void print(int amountMistakes) {

        System.out.println(stagesOfHangman[amountMistakes]);
    }

}





