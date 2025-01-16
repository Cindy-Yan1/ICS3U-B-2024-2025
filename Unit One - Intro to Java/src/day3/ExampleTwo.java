package day3;

public class ExampleTwo {
    public static void main(String[] args) {
        double x = 7;           // widening conversion int -> double
                                // implicit cast

        double a = (double) 4 / 3;  // explicit cast and widening conversion
        System.out.println(a);

        a = (double) (4 / 3);
        System.out.println(a);

        // int z = 8.9;         // Java does not perform implicit narrowing conversion

        int z = (int)8.9;       // we can perform an explicit narrowing conversion 

        // double n = (double)false;       // cannot cast from boolean to double




    }

}
