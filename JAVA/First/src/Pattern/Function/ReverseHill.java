package Pattern.Function;

import java.util.Scanner;

public class ReverseHill {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the No. :");
        int n = input.nextInt();
        for (int i=1; i<=n; i++){

            for(int j =1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<n; j++){
                System.out.print("*");
            }
            for (int j =i; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
