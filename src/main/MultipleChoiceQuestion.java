package main;

public class MultipleChoiceQuestion extends Question {

    // Class Variables (none)

    // Constructor
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

    // Methods
    @Override
    public boolean checkAnswer(String answer) {
        // answer "A" or "B" (Note: String not a char)
        // answer "a" or "b"

        String actualAnswer = this.getTheAnswer();
        // Case insensitive
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}
