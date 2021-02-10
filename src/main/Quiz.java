package main;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;


// Requirements:
//      Add questions to quiz
//      Run the quiz
//      Grade the quiz

public class Quiz {
    // Class Variables
    private ArrayList<Question>questions = new ArrayList<>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);


    // Constructor
    public Quiz() {

    }

    // Methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        // Loop through each question
        for(Question question: questions) { // Loops through each question in our array of Questions
            // Ask the user the question
            System.out.println(question.getTheQuestion());
            // Get the users answer (utilize private method 'getUsersAnswers()' inside runQuiz method)
            String usersAnswer = this.getUsersAnswers();
            // Check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            // Increment numberOfQuestionsCorrect if answered correctly
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
        // Grade the quiz (to get percentage divide by number of questions correct by number of question)
        double percentageCorrect = ((double)this.numberOfQuestionsCorrect / (double)this.questions.size()) * 100; // We have to cast (convert: (double)) the integers to doubles because doubles can deal with decimals and integers cannot
        System.out.println("Users Grade: " + percentageCorrect + "%");
    }





    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine(); // Set it to a string so we can capture whatever is returned from that method
        return usersAnswer; // After we return the userAnswer, we are now "getting" the user's answer
    }


}
