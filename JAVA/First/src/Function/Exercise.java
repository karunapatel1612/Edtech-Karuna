package Function;

import java.util.Scanner;

public class Exercise {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter the number to print the table: ");
        //int n = input.nextInt();
        //getTable(n);
        System.out.println("Enter the number to calculate the sum of odd number: ");
//        int num = input.nextInt();
//        int sum = getSumOfOddNum(num);
//        System.out.println("sum of odd num is :"+sum);

    }
    public static int getSumOfOddNum(int num){
        int n = 1;
        int sum =0;
        while(n <= num){
            if(n%2!=0){
                sum+=n;
            }
            n++;
        }
        return sum;
    }
    public  static void getTable(int n){
        int i =1;
        while(i<=10){
            System.out.println(n+" X "+i+"="+(n*i));
            i++;
        }
    }
}

