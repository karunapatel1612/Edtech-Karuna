import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args){
        int a = 1;
        System.out.println(a);
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        a = a+x1;
        System.out.println(a);
        int x2 = input.nextInt();
        a +=x2;
        System.out.println(a);

        int x3 = input.nextInt();
        a+=x3;
        System.out.println(a);

        System.out.println("Sum : "+a );

    }
}
