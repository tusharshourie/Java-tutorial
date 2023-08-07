class Circle{
    private float radius,area,circumference;
    void setRadius(float r){
        radius = r;
    }
    void setArea(float a){
        if (a==22*radius*radius/7)
            area = a;
        else
            System.out.println("WARNING : Wrong area as per the radius.");
    }
    void setCircumference(float c){
        if (c==2*22*radius/7)
            circumference=c;
        else
            System.out.println("WARNING : Wrong circumference as per the radius.");
    }
    float getRadius(){
        return radius;
    }
    float getArea(){
        return area;
    }
    float getCircumference(){
        return circumference;
    }
}
public class circleusinggetandset{
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.setRadius(9.0f);
        cr.setArea(254.571428571429f);
        cr.setCircumference(56.5714285714286f);
        System.out.println("Area : "+cr.getArea()+" sq. cm");
        System.out.println("Circumference : "+cr.getCircumference()+" cm");
    }
} 
