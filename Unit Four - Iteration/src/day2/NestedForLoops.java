package day2;

public class NestedForLoops {
    public static void main(String[] args) {
        // exampleOne();
        //createBox(4,8);

        // createTriangle();
        // int height = 8;
        // createTriangle(height);

        backTriangle(5);

        int height = 5;
        int width = 6;
        createEmptyBox(width, height);
                }
        

        // ******
        // *    *
        // *    *
        // ******
        
        private static void createEmptyBox(int width, int height){
            for (int i = 0; i < width; i++){
                System.out.print("*");
            }
            System.out.println();

            for (int i = 0; i < height - 2; i++){
                System.out.print("*");
                for (int j = 0; j < width - 2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int i = 0; i < width; i++){
                System.out.print("*");
            }
            System.out.println();

        }

        private static void backTriangle(int h) {
            for (int i = 0; i < h; i++){
                for (int j = 0; j < h - 1 - i; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        private static void createTriangle(int height) {
            for (int i = 0; i < height; i++){
                for (int j = 0; j<= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
                
        // *
        // **
        // ***
        // ****
        // *****          
        private static void createTriangle() {
            for (int t = 0; t < 5; t++){
                for (int n = 0; n <= t; n++){
                    System.out.print("*");
                }
                System.out.println();
            }
                
        }
        
        
        
            // create a box of stars with width of 7 and height of 3
             // *******
             // *******
             // *******
        
            private static void exampleOne(){
        
        for(int j = 0; j < 3; j++){
            for (int i = 0; i < 7; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

        private static void createBox(int row, int cols) {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < cols; c++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


        
    }


