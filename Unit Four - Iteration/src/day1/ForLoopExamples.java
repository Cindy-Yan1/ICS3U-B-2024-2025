package day1;

public class ForLoopExamples {
    public static void main(String[] args) {
        // loops allow us to repreat code multiple times
        // This unit we will learn the for loop and te while loop

        // for (int i = 0; i < 10; i ++){
        //     System.out.println(i);
        // }

        // for loops are MEANT count
        // they have an initial/starting value (int i = 0) i is the counter
        // a condition to keep going/counting as long as it is true (i < 10)
        // how it counts    (i++)

        // create a for loop to print the numbers 10, 8, 6, 4, 2, 0, -2, -4

        // for (int a = 10; a >= -4; a -= 2){
        //     System.out.println(a);
        // }

        // count the vowels in a the String str that is all lowercase

        // String str = "alphabet soup";
        // String vowels = "aeiou";

        // int numVowels = 0;
        // for (int i = 0; i < str.length(); i++){
        //     String letter = str.substring(i, i+1);
        //     if (vowels.indexOf(letter)>=0)
        //         numVowels++;
        // }

        // System.out.println("There are" + numVowels + "in" + str);

        String str = "Alphabet Soup";

        for (int i = str.length()-1; i >=0; i--){
            System.out.print(str.substring(i, i+1));
    }
    
}


}
