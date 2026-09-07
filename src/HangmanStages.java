
public class HangmanStages {
    private static final String[] STAGES = {
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

    public void printStages(int amountMistakes) {
        System.out.println(STAGES[amountMistakes]);
    }

    public void printLoseGameState() {
        System.out.println(STAGES[6]);
    }


}





