import java.util.Scanner;

public class takeinput {
    public static void main(String[] args){
    System.out.println("Taking input from the user");
    Scanner sc = new Scanner(System.in);
    
    // System.out.println("Enter number 1: ");
    // // int a = sc.nextInt();
    // float a = sc.nextFloat();

    // System.out.println("Enter number 2: ");
    // // int b = sc.nextInt();
    // float b = sc.nextFloat();
    // // int sum = a+b;
    // float sum = a+b;
    // System.out.println("The sum of the two numbers: ");
    // System.out.print(sum);

    boolean b1= sc.hasNextInt();
    System.out.println(b1);

    // String str = sc.next();
    // String str = sc.nextLine();
    // System.out.println(str);
    sc.close();

    }
}
