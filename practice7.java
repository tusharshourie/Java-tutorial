class Circle{
    public int radius;
    Circle(int r){
        System.out.println("I am the parameterised constructor of circle");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterised constructor");
        this.height = h;
    }
    public double area(){
        return Math.PI*this.radius*this.radius*height;
    }
}
public class practice7 {
    public static void main(String[] args) {
        //Question 1
        // Circle objc = new Circle(12);
        // objc.area();
        // Cylinder obj = new Cylinder(12, 4);
    }
}
