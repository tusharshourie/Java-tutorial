interface Bicycle{
    int a =55;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface Bicyclehorn{
    void blowhorn1();
    void blowhorn2();
}
class Avoncycle implements Bicycle, Bicyclehorn{
    public void applybrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedup(int increment){
        System.out.println("Speeding up");
    }
    public void blowhorn1(){
        System.out.println("beep beep");
    }
    public void blowhorn2(){
        System.out.println("boop boop");
    }
}
public class introtointerfaces {
    public static void main(String[] args) {
        Avoncycle cycletushar =  new Avoncycle();
        cycletushar.applybrake(1);
        cycletushar.speedup(5);
        //you can create properties in interfaces
        //cannot modify the properties in interfaces as they are final
        //System.out.println(cycletushar.a);

        cycletushar.blowhorn1();
        cycletushar.blowhorn2();
    }
    
}
