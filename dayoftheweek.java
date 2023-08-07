import java.util.Scanner;

public class dayoftheweek {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the respective day name: ");
        num = sc.nextInt();

        switch(num){
            // case 1: System.out.println("Monday");
            // break;

            // case 2: System.out.println("Tuesday");
            // break;

            // case 3: System.out.println("wednesday");
            // break;

            // case 4: System.out.println("Thursday");
            // break;

            // case 5: System.out.println("Friday");
            // break;

            // case 6: System.out.println("Saturday");
            // break;

            // case 7: System.out.println("Sunday");
            // break;

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            
        }
        sc.close();
    }
    
}
