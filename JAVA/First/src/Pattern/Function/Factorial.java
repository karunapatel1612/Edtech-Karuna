package Pattern.Function;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Num: ");
        int num = input.nextInt();
        long fact_sum = getFactSum(num);
        System.out.println("Here the Factorial value of "+num+" is "+fact_sum);
    }
    public static long getFactSum(int num){
       int i =1;
       long fact = 1;
       while(i<=num){
           fact*=i;
           i++;
       }
       return fact;
    }
}
