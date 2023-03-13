package mobprogramming1;

import java.util.Random;

public class Player {

    private String name;

    public int getPlayerGuessNumber(){
        Random line = new Random();
        return line.nextInt(1, 3);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
