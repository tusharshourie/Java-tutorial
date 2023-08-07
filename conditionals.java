public class conditionals {
    public static void main(String[] args){
    //     int age=18;
    //     if(age>18){
    //         System.out.println("you can drive");
    //     }
    //     else if(age==18){
    //         System.out.println("gotta wait for another year buddy");
    //     }
    //     else{
    //         System.out.println("you cannot drive yet");
    //     }
    

    // FOR LOGICAL AND
    boolean a = true;
    boolean b = false;
    if(a&&b){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }
    
    // FOR LOGICAL OR
    boolean a1 = true;
    boolean b1 = false;
    if(a1||b1){
        System.out.println("Y");
    }
    else{
        System.out.println("N");
    }

    //FOR LOGICAL NOT
    System.out.print("NOT(A) is ");
    System.out.println(!a);
    System.out.print("NOT(B) is ");
    System.out.print(!b);
    }
    
}
