package Function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        boolean response = isPalindrome(num);
        if(response){
            System.out.println("No is Palindrome");
        }else{
            System.out.println("No is not Palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int input_num = num;
        int new_num = 0;
        while(num>0) {
            int digit = num % 10;
            new_num = new_num * 10 + digit;
            num /= 10;
        }
        return input_num==new_num;
    }
}
