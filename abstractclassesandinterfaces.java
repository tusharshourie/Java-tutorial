abstract class Parent{
    public Parent(){
        System.out.println("I am the constructor of base1");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}

abstract class child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstractclassesandinterfaces {
    public static void main(String[] args) {
        // Parent p = new Parent();
        // child2 c = new child2();
        // child1 c1 = new child1();
    }
}
