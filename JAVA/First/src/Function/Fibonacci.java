package Function;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Fibonacci Series!");
        System.out.print(" Enter the number : ");
        int num =  input.nextInt();
         getFibonacci(num);
//        System.out.println(" Fibonacci  Series are : ");

    }
    public static void getFibonacci(int num){
        if(num<0) return;
        System.out.print("0 ");
        if(num==0) return;
        int first = 0, second =1;
        while (first+second <= num){
            int third = first+second;
            System.out.print(third+ " ");
            first = second;
            second = third;
        }



    }
}

