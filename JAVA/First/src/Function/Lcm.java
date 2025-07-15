package Function;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("please enter the number : ");
        int first = input.nextInt();
        System.out.println("please enter the number : ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println(" LCM of these two no. is : " +lcm);



    }

    public static int lcm(int first, int second) {
      int i = 0;
      while (i<=second)
      {

          int factor = first*i;
          if(factor % second ==0){
              return factor;

      }
      i++;

      }
        return 0;

    }

}
