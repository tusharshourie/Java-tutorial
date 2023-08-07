public class varargs {
    static int sum(int ...arr){
        // Available as int [] arr;
        int result =0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varargs");
        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 6 and 7 is: " + sum(6, 7));
        System.out.println("The sum of 6, 7, 8 and 9 is: " + sum(6, 7, 8, 9));
        System.out.println("The sum of 4, 3 and 2 is: " + sum(4,3,2));
    }
    
}
