package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array");
        int [] numArr = {1, 2, 4, 2, 5, 6, 8, 4};
        System.out.println("Now Enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOccurrences(numArr, num);
        System.out.println( "Your element was found at "+occurrences+" Times");
    }

    public  static int noOccurrences(int[] numArr, int num){
        int occ = 0;
        int i= 0;
        while (i<numArr.length){
            if(numArr[i]==num){
                occ++;
            }
            i++;

        }

     return occ;
    }
}
