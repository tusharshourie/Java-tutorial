public class recursion {
    // static int factorial(int n){
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     else{
    //         return n * factorial(n-1);
    //     }
    // }
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if (n==1 || n==2) {
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
    public static void main(String[] args) {
        // int n =4;
        // System.out.println("The value of factorial of n is: " + factorial(n));
        int count =10;
        System.out.println("Fibonacci series of " + count + "numbers: ");
        for(int i =0; i< count; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    
}
