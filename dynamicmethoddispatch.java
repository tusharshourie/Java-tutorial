class Phone{
    public void on(){
        System.out.println("Turning on the phone");
    }
    public void time(){
        System.out.println("8 AM");
    }
}

class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on the smartphone.....");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
    //    Phone obj = new Phone();
    //    Smartphone sm1 = new Smartphone();
    //    obj.name(); 
    Phone obj = new Smartphone();
    obj.time();
    obj.on();
    }
}
