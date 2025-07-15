import java.util.Scanner;

public class Airthmatic {
    public static void main(String[] args){
//        int a = 520;
//        int b = 120;
//        System.out.println("Addition is : "+(a+b));
//        System.out.println("Subtraction is "+(a-b));
//        System.out.println("Multiplication is "+(a*b));
//        System.out.println(a%b);
//
//        System.out.println(9/3/3);

        // create a program to calculate product of two floating points numbers

        float  a = 21.3f;
        float b = 2.2f;
        System.out.println(a*b);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        float i = input.nextFloat();
        System.out.println("Enter the second Number:  ");

        float j = input.nextFloat();
        System.out.println("Product of two numbers are "+(i*j));





    }
}
