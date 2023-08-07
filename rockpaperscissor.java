import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor {
    public static void main(String[] args) {
        // 1= rock 2=paper 3=scissors
        int user_choice;
        Random rand = new Random();
        int comp_choice= rand.nextInt(3);
        System.out.println("***ROCK PAPER SCISSORS GAME!***");
        System.out.println("Choices: \n 0. Rock \n 1. Paper \n 2. Scissors");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        user_choice=sc.nextInt();

        System.out.printf("Your choice: %d\n", user_choice);
        System.out.printf("Computer\'s choice: %d\n", comp_choice);
        if(user_choice==comp_choice){
            System.out.println("it\'s a tie");
        }
        else if(comp_choice==0){
            if(user_choice==1)
            {
                System.out.println("User won!");
            }
            else if(user_choice==2)
            {
                System.out.println("Computer won");
            }
        }

        else if(comp_choice==1){
            if(user_choice==0)
            {
                System.out.println("Computer won!");
            }
            else if(user_choice==2)
            {
                System.out.println("User won");
            }
        }

        else if(comp_choice==2){
            if(user_choice==0)
            {
                System.out.println("User won!");
            }
            else if(user_choice==2)
            {
                System.out.println("Computer won");
            }
        }
        sc.close();

    }
    
}
