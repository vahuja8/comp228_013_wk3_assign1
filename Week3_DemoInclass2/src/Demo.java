import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // Initialize the score to zero
        
        // randomNumbers object will produce secure random numbers
        SecureRandom random_option = new SecureRandom(); 
        


        // Array to store correct answers for each question
        char[] correctAnswers = {'a', 'b', 'c', 'd', 'a'};
        
        
        String[] introMessage= {"excellent !" , "Good! " ," Keep it up.." , "Nice Work!", "Dont Sleep!!!!!!!" };
        
        String[] answerComment= {"you did nice!!- success", "try again!!!"};
        
        String[] resultComment= {"A","B", "C,", "D" ,"F" };
        

        // Array to store questions
        String[] questions = {
            "1. What is the capital of France?\n" +
            "a) Paris\n" +
            "b) Rome\n" +
            "c) Madrid\n" +
            "d) Berlin\n",

            "2. Who wrote 'Romeo and Juliet'?\n" +
            "a) William Shakespeare\n" +
            "b) Charles Dickens\n" +
            "c) Jane Austen\n" +
            "d) J.K. Rowling\n",

            // Add more questions here
        };

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
        	
        	System.out.println(introMessage[i]);
        	
            System.out.println(questions[i]);
            char userAnswer = scanner.next().charAt(0); // Read user's answer

            // Compare user's answer with correct answer
            if (userAnswer == correctAnswers[i]) {
                score++; // Increment score if answer is correct
            }
        }

        // Calculate and display the final score
        double percentage = (double) score / questions.length * 100;
        System.out.println("Your score: " + score + "/" + questions.length);
        System.out.println("Percentage: " + percentage + "%");
        
        /*
         * implement -- Grade calculation using if-else or switch case!!
         */

        scanner.close();
    }
}
