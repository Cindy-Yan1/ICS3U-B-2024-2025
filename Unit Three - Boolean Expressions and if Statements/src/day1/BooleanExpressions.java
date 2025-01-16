package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean hasRedShoes = true;

        System.out.println(hasRedShoes == true); // prints true because T == T is true
        System.out.println(hasRedShoes == false); // prints false becase T == F is false

        // = is assignment operator (assigns values)
        // is equality operator (checks if they're equal)

        int numStudents = 9;

        boolean largeClass = numStudents > 24; // numStudents > 24 is false
        System.out.println("Large Class?" + largeClass); // pritnts false

        /*
         * == equals
         * > greater than
         * >= greater than or equal
         * < less than
         * <= less than or equal
         * != not equal
         * ! not
         * 
         */

        int x = 27;

        boolean a = x > 10; // a will be true
        boolean b = x <= 10; // b will be false

        boolean c = a == !b; // boolean expression is a == !b
                             // c will be true => T == !F => T ==T

        boolean d = !(x <= 10); // !(27 <= 10) => !F => T

    }
}
