package main;

public class QuizRunner {
    public static void main(String[] args) { // Having a class with only 'main' in it is a good practice!! Keeps us from losing our starting place when our apps get more and more complex
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What sound does a dog make?\nA: Bark\nB: Quack\nPlease type a single letter as an answer", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion); // addQuestion takes in just the genral parent class but we passed in my multiple choice question. this is allowed bc Question is abstract and myMultipleChoiceQuestion extends that question class. (making it apart of the family of the qeusiton class)

        CheckBoxQuestion myCheckBoxQuestion= new CheckBoxQuestion("Select all that apply, which animals can fly?\nA: Penguins\nB: Doves\nC: Owls", "B,C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Dogs are carnivores? \n True or False", "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }
}
