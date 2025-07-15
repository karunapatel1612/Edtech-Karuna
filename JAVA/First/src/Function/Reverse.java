package Function;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("please enter the number  to get reverse value: ");
        int num = input.nextInt();
        int reverse_val = reverse(num);
        System.out.println("Your Reverse No. is : " + reverse_val);
    }
    public  static int reverse(int num){
        int new_num = 0;
        while (num > 0){
            int digit = num%10;
            new_num = new_num*10+digit;
            num/=10;
        }
        return new_num;
    }
}
