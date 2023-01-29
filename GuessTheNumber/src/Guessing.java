public class Guessing {

    // Your local variables here
    private int low = 0;
    private int high = 1000;
    private int currentGuess;
    private int numberOfGuesses;
    /**
     * Implement how your algorithm should make a guess here
     */
    public int guess() {
        int generatedGuess = (int)Math.floor(Math.random() * (high - low + 1) + low);
        this.currentGuess = (int)Math.floor(Math.random() * (high - low + 1) + low);
        return generatedGuess;
    }

    /**
     * Implement how your algorithm should update its guess here
     */
    public void update(int answer) {
        // answer = -1 if guess is too high
        // answer = 1 if guess is too low 
        this.numberOfGuesses = this.numberOfGuesses + 1;
        if (this.numberOfGuesses == 10) {
            return;
        }
    }
}
