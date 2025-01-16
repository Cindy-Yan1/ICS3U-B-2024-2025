package day1;

public class DayOneHomework {
    public static void main(String[] args) {

       
    // Question 1: 
        double price;
        double item1 = 15.95;
        price = item1 * 3;
        System.out.println(price);

    // Question 2: 
        double area;
        double length = 8.5; 
        int width = 6;
        area = length * width;
        System.out.println(area);

    // Question 3:
        double average;
        double score1 = 90;
        double score2 = 95;
        double score3 = 87;
        double score4 = 84;
        double score5 = 98;
        average = (score1 + score2 + score3 + score4 + score5)/5;
        System.out.println(average);
    
    // Question 4: 
        int num = 137;
        int tensDigit = num / 10 % 10;
        System.out.println(tensDigit); 

    // Question 5: 
        int remainder;
        remainder = 10 % 3;
        System.out.println(remainder);

    // Question 6:
        double circumference;
        final double PI = 3.14;
        double radius = 4.7;
        circumference = (PI * radius * 2);
        System.out.println(circumference);

    // Question 7:
        double ticket;
        ticket = 12.50 * 1.15;
        System.out.println(ticket * 4);

    // Question 8:
        int unit;
        int threeDigit = 456;
        unit = threeDigit % 10;
        System.out.println(unit);

    // Question 9:
        double base = 9.8;
        double height = 5.2;
        double areaTriangle = base * height / 2;
        System.out.println(areaTriangle);

    // Question 10:
        int num2 = 183;
        int remain = num2 % 7;

        if (remain == 0)
        {
            System.out.println("The number 183 is divisible by 7.");
        }
        else
        {
            System.out.println("The number 183 is not divisible by 7.");
        }





}
}
