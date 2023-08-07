import java.util.Scanner;

public class introstrings {
    public static void main(String[] args){
        String name = new String("hello tushar");
        // String name = "TUSHAR";
        System.out.println(name);

        int a = 5;
        float b = 6.6788f;
        System.out.printf("The value of a is %d and the value of b is %f \n", a, b);

        System.out.print("Enter something to be printed: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
}
