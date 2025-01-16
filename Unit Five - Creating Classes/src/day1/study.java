package day1;

public class study {
    public static void main(String[] args) {
        // Create stars that is a triangle - 5 H and 5V
        
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }

            System.out.println(); 
        }



        // Create stars that is an upside down triangle 

        for (int i = 5; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
        }
        System.out.println();
    }

        

        // Create inverted triangles : upside-down  

        for (int i = 1; i < 6; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for (int x = i; x < 6; x++){
                System.out.print("*");
            }

            System.out.println();
        }



        // Create inverted triangle : rightside up 

        for (int i = 5; i > 0; i--){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int x = i; x < 6; x++) {
                System.out.print("*");
            }

            System.out.println();
        }

}
}
