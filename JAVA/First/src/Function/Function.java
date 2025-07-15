package Function;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
//        greeting();
//        System.out.println("How are you ?");
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = input.nextInt();
        printTrangle(n);


    }

    public  static void printTrangle(int n){
        for (var i = 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


  /*  public static void greeting(){
        System.out.println("Good Evening Karuna Patel!");
    }
   */

}
