public class practice4_methods {
        //Question 1 : multiplication table
    //     static void multiplication(int n){
    //         for(int i =1; i<=10; i++){
    //             System.out.format("%d x %d = %d \n", n, i, n*i);
    //         }
    //     }
    
    //Question 2 : print the pattern using functions
    // static void pattern1(int n){
    //     for(int i =0; i<n; i++){
    //        for(int j =0; j<i+1; j++){
    //         System.out.print("*");
    //        } 
    //        System.out.println();
    //     }
    // }

    //Question 3: recursive function to calculate the sum of first n natural nos.
    // static int sumrec(int n){
    //     if(n ==1){
    //         return 1;
    //     }
    //     else{
    //         return n + sumrec(n-1);
    //     }
    // }

    //Question 4: nth term of the fibonacci series
        // static int fib(int n){
        //     if(n==1 || n==2){
        //         return n-1;
        //     }
        //     else{
        //         return fib(n-1)+fib(n-2);
        //     }
        // }
    
    
    //Question5: question 2 using recursion
    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i =0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        // multiplication(7);
        // pattern1(4);
        // int c = sumrec(8);
        //fib(5);
        //int f = System.out,println(f);
        // System.out.println(c);
        pattern1_rec(4);



    }
}
