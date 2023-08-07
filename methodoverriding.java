class A{
    public int a;
    public int tushar(){
        return 5;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }

    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.meth2();
        b.meth2();
    }
    
}
