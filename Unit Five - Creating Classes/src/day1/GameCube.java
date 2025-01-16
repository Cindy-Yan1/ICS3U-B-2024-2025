package day1;

public class GameCube {
    // non=static instance variables
    // also called attributes
    // they belong to the instance

    private int numSides; 
    private int topSide;
    
    //* Constructer sets the initial state of the instance */
    public GameCube() {
        numSides = 6; 
        roll(); 
    }

    // this refers to the instance variable because
    // this refers to this object or this instance
    // int numSides is just the argument/parameter
    // this.numSides refers to the atttribute numSides
    public GameCube(int numSides) {
        this.numSides = numSides; 
        roll();
    }

    public void roll(){
        topSide = (int)(Math.random()*numSides) + 1;
    }

    public int getTopSide(){
        return this.topSide; 
    }
}

