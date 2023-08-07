class Base{
    int x;
    void printme(){
        System.out.println("I am a constructor");
    }
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x = x;
        System.out.println("I am in base and setting x now");
    }
}

class Derived extends Base{
    int y;

    public int gety(){
        return y;
    }

    public void sety(int y){
        this.y = y;
    }

}
public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());

        Derived d = new Derived();
        d.sety(45);
        System.out.println(d.gety());
    }
}
