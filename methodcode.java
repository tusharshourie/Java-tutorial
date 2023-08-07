public class methodcode {
        static int logic(int x, int y)
        // int logic(int x, int y)  //method
            {
            int z;
            if(x>y){
                z=x+y;
            }
            else{
                z=(x*y)+1;
            }
            return z;
        }

        public static void main(String[] args) {

        int a = 5;
        int b= 4;
        int a1 = 1;
        int b1=2;
        //method invocation using object creation if not done static in method declaration
        // methodscode obj = new methodscode();
        // int c = obj.logic(a, b);
        int c = logic(a, b);
        int c1 =logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
    
}
