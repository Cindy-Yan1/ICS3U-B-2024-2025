package day2;

public class ifElseStatements {

    public static void main(String[] args) {
        // else is part of an if statement
        // it is executed if the part above was not executed (true)

        int x = (int)(Math.random()*1000) + 1;

        if(x % 2 == 0){
            System.out.println(x + "is even!");
        }
        else{
            System.out.println(x+ "is odd.");
        }
        
        // if(x % 2 != 0){
        //     System.out.println(x + "is odd");
        // }

    }
}
