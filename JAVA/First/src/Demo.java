import java.util.Scanner;

public class Demo {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your name");
    String name = input.nextLine();
    System.out.print("Welcome"+name+" to Karuna ki java class!\n");

    System.out.println("Enter the no.");
    int a1 = input.nextInt();
    System.out.println(" Enter Second No.");
    int a2 = input.nextInt();
    System.out.println("Sum of total No. : "+ (a1+a2) );

}
}
