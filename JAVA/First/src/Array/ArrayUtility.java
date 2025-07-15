package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayUtility {
    public static int inputArray( ) {
        Scanner input   = new Scanner(System.in);
        System.out.print("Please Enter the number of element: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while(i< size){
            System.out.println(" Please enter the no. ");
            num[i] = input.nextInt();
            i++;
        }
    }
}
