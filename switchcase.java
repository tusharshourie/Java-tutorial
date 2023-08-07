import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age){
            case 18: System.out.println("You are going to be an adult");
            break;

            case 36: System.out.println("You are an adult");
            break;

            default: System.out.println("enjoy your life");
        }
        // if (age>56){
        //     System.out.println("You are experienced!");
        // }
        // else if(age>46){
        //     System.out.println("You are semi-experienced!");
        // }
        // else if(age>36){
        //     System.out.println("You are semi-semi-experienced!");
        // }
        // else{
        //     System.out.println("You are not experienced");
        // }
        // if(age>2){
        //     System.out.println("You are not a baby!");
        // }
        
        sc.close();

    }
}
