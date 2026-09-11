
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

    public String getStage(int amountMistakes) {
        return STAGES[amountMistakes];
    }

    public String getLoseGameState() {
        return STAGES[STAGES.length - 1];
    }

}






