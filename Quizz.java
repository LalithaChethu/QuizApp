package QizzApp;

import java.util.Scanner;

public class Quizz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Score = 0;

        System.out.println("Welcome to the Java Quiz");

        System.out.println("Q1. Which keyword is used to create a class in Java?");
        System.out.println("a)class  b)def  c)function d)struct");
        System.out.print("Enter your Answer: ");
        String ans1 = sc.nextLine();
        if (ans1.equalsIgnoreCase("a"))
            Score++;

        System.out.println("Q2. Which data type is used to store decimal numbers?");
        System.out.println("a)int b)float c)boolean d)char");
        System.out.print("Enter your Answer: ");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("b"))
            Score++;

        System.out.println("Q3. Which method is the entry point of any Java program?");
        System.out.println("a)start() b)init() c)main() d)run()");
        System.out.print("Enter your Answer: ");
        String ans3 = sc.nextLine();
        if (ans3.equalsIgnoreCase("c"))
            Score++;

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + Score + " / 3");

        if (Score == 3) {
            System.out.println("Excellent!");
        } else if (Score == 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }
        sc.close();
    }
}

