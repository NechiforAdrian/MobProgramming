package mobprogramming4;

import java.util.Scanner;

public class GameLauncher {

    public static final String QUESTION_1 = "Which is the capital of England?";
    public static final String QUESTION_1_ANSWERS = "a.Paris" + "\n" + "b.London" + "\n" + "c.Helsinki";
    public static final String QUESTION_2 = "When was the last bigger earthquake in Romania?";
    public static final String QUESTION_2_ANSWERS = "a.1977" + "\n" + "b.1962" + "\n" + "c.1992";
    public static final String QUESTION_3 = "Who is the president of France?";
    public static final String QUESTION_3_ANSWERS = "a.Emmanuel Macron" + "\n" + "b.Jon Cringe" + "\n" + "c.Nicolas Gua";

    public static void main(String[] args) {
        int score = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("In this game we prepare to you three question.");
        System.out.println("Answer to question whit a,b,c, just one answer is correct.");
        System.out.println("Please enter your name: ");

        String name = scan.nextLine();
        System.out.println("First question:");
        System.out.println(QUESTION_1);
        System.out.println(QUESTION_1_ANSWERS);
        String userAnswer = scan.nextLine();
        System.out.println("Second question:");
        System.out.println(QUESTION_2);
        System.out.println(QUESTION_2_ANSWERS);
        String userAnswer2 = scan.nextLine();
        System.out.println("Third question:");
        System.out.println(QUESTION_3);
        System.out.println(QUESTION_3_ANSWERS);
        String userAnswer3 = scan.nextLine();

        if (userAnswer.equalsIgnoreCase("b")) {
            System.out.println("Good job!");
            score++;
        } else {
            System.out.println("You wrong at the first question!");
            System.out.println("The answer was (b)");
        }
        if (userAnswer2.equalsIgnoreCase("c")) {
            System.out.println("Good job!");
            score++;
        } else {
            System.out.println("You wrong at the second question!");
            System.out.println("The answer was (c)");
        }
        if (userAnswer3.equalsIgnoreCase("a")) {
            System.out.println("Good job!");
            score++;
        } else {
            System.out.println("You wrong at the third question!");
            System.out.println("The answer was (a)");
        }
        System.out.println(name + ", your score is: " + score);


    }
}
