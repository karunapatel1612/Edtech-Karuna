package Function;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to armstrong num.");
        System.out.print(" Enter the number : ");
        int num = input.nextInt();
        boolean val = isArmstrong(num);
        if(val){
            System.out.println("No. is armstrong.");
        }else{
            System.out.println("No. is not armstrong.");
        }
    }
    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numcopy = num;
        int finalnumber = 0;
        while (num>0){
            int last_digit = num%10;
            num /=10;
            finalnumber +=pow(last_digit, noOfDigits);

        }

        return  finalnumber == numcopy;

    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while (i<num2){
            result*=num1;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int digit   = 0;
        while (num> 0){
            digit++;
            num/=10;
        }
        return  digit;

    }
}
