import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        // int year;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the year: ");
        // year = sc.nextInt();
        // if(year%4==0){
        //     System.out.println("It's a leap year");
        // }
        // else {
        //     System.out.println("it's not a leap year");
        // }
        // sc.close();

        //question 2 -> type of website

        String web;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name of the website: ");
        web = sc.nextLine();
        if(web.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(web.endsWith(".org")){
            System.out.println("organisational website");
        }
        else if(web.endsWith(".in")){
            System.out.println("indian website");
        }
        else {
            System.out.println("it's probably a personal website");
        }
        sc.close();
    }
    
}
