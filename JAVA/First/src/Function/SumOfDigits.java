package Function;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Num: ");
        int num = input.nextInt();
        int fact_sum = getSumOfDigits(num);
        System.out.println("Here the sum of digits "+num+" is "+fact_sum);
    }
    public static int getSumOfDigits(int num){
       int sum = 0;
       while (num>0){
           sum +=(num%10);
           num /=10;
       }
       return sum;
    }

}
