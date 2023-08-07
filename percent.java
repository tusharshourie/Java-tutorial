import java.util.Scanner;

public class percent {
    public static void main(String[] args){
        int p,c,m,e,co;
        float total, obtained;
        float percentage;

        System.out.println("***PERCENTAGE CALCULATOR*** ");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter physics marks: ");
        p = s.nextInt();

        System.out.println("Enter chemistry marks: ");
        c = s.nextInt();

        System.out.println("Enter maths marks: ");
        m = s.nextInt();

        System.out.println("Enter english marks: ");
        e = s.nextInt();

        System.out.println("Enter computer marks: ");
        co = s.nextInt();

        obtained = p+c+m+e+co;

        System.out.println("Enter the total marks: ");
        total=s.nextInt();

        percentage=obtained/total*100;
        System.out.println("The percentage you received is: ");
        System.out.println(percentage);
        s.close();
    }
    
}
