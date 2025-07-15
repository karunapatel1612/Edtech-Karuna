package Function;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("please enter the number : ");
        int num = input.nextInt();
        boolean val = isPrime(num);
        if(val){
            System.out.println("Number is prime");
        }else{
            System.out.println("no. is not prime");
        }

    }
    public static boolean isPrime(int num){
      int i = 2;
      while(i<num){
          if(num%i==0){
              return false;
          }
          i++;
      }
      return true;

    }
}
