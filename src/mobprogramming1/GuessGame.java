package mobprogramming1;

import java.util.Random;

public class GuessGame {

    public void startGame(){

        Random random = new Random();
        int computerGeneratorNumber = random.nextInt(1, 3);
        System.out.println("Computer generator number: " + computerGeneratorNumber);

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        player1.setName("One");
        player2.setName("Two");
        player3.setName("Tree");

        int player1Guess = player1.getPlayerGuessNumber();
        int player2Guess = player2.getPlayerGuessNumber();
        int player3Guess = player3.getPlayerGuessNumber();

        boolean isGameOn = true;

        while(isGameOn){
            if(player1Guess == computerGeneratorNumber){
                isGameOn = false;
                System.out.println(player1.getName() + " is the Winner!!!");
            }else if(player2Guess == computerGeneratorNumber){
                isGameOn = false;
                System.out.println(player2.getName() + " is the Winner!!!");
            }else if(player3Guess == computerGeneratorNumber);{
                isGameOn = false;
                System.out.println(player3.getName() + " is the Winner!!!");
            }

        }

    }
}
