package day1;

public class work {
    public static void main(String[] args) {
        // // String str = "hello";

        // // // System.out.println(str.substring(2,4));

        // // // System.out.println(str.length());
        // // System.out.println(str.substring(5));

        // // int counter = 0;
        // // for (int x = 10; x>0; x--) {
        // // for (int y = x; y <=x; y++){}
        // // }

        // // int diff = 9;

        // // if ((a < 13 || a > 19) || (b < 13 || b > 19)) {
        // // diff = Math.abs(a-b);
        // // }

        // // return diff;
        // // }

        
        // int a = 100;
        // int b = 100;



        // // Question 1

        // int diff = Math.abs(a - b);

        // if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
        //     diff = 9;
        // }

        // return diff;



        // // Question 2

        // if (a == b)
        //     return 0;
        // if (a > b) {
        //     if (a % 5 == b % 5)
        //         return b;
        //     else
        //         return a;
        // }

        // else {
        //     if (a % 5 == b % 5)
        //         return a;
        //     else
        //         return b;
        // }



        // // Question 3
        
        // boolean isTrue = false;

        // if (a == 8 || b == 8)
        //     isTrue = true; 
        // if (a + b == 8)
        //     isTrue = true;
        // if (Math.abs(a-b) == 8)
        //     isTrue = true;

        // return isTrue; 


        
        // // Question 4

        int numV = 0;

        for (int i = 0; i<str.length(); i++){
            String ch = str.substring(i, i+1)
            if (ch.equals("a") || ch.equals("e")|| ch.equals("i")|| ch.equals("o"|| ch.equals("u"))){
                numV++; 
            }
        }
        return numV; 



        // // Question 5

        int numA = 0;
        int numB = 0;

        for (int i = 0; i<= a.length()-5; i++ ) {
            String chA = a.substring(i, i+5).toLowerCase(); 
            String chB = b.substring(i, i+5).toLowerCase(); 
            if (chA.equals("ics3u") || chA.equals("ics4u")){
                numA++; 
            }
            if (chB.equals("ics3u")||chB.equasl("ics4u")) {
                numB++
            }
        }

        return numB == numA; 



        // Question 6

        int rows = 5;
        int cols = 4;

        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++) {
                if ((j > 0 && j < cols - 1) && (i > 0 && i < rows - 1))
                    System.out.print(rows);
                else
                    System.out.print(cols);
            }
            System.out.println();
            

        }







    }
}
