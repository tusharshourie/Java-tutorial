public class methodoverloading {
    static void foo(){
        System.out.println("GOOD MORNING BRO");
    }

    static void foo(int a)
    {
        System.out.println("GOOD MORNING " + a + " BRO!!!");
    }

    static void foo(int a, int b)
    {
        System.out.println("GOOD MORNING " + a + " BRO!!!");
        System.out.println("GOOD MORNING " + b + " BRO!!!");
    }

    static void change(int a){
        a=98;
    }

    static void change1(int [] arr){
        arr[0]=98;
    }

    static void telljoke(){
        System.out.println("I invented a new word!");
        System.out.println("PLAGIARISM");
    }
    public static void main(String[] args) {
        // telljoke();
        // int [] marks = {33, 54, 11, 76 ,89};
        // change1(marks);
        // System.out.println(marks[0]);
        foo();
        foo(69, 10);
        foo(3000);

        
    }
    
}
