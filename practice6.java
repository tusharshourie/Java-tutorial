class Cylinder{
    private int height;
    private int radius;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height=height;
    }
    public void setradius(int radius){
        this.radius = radius;
    }

    public int getradius(){
        return radius;
    }

    public void setheight(int height){
        this.height = height;
    }

    public int getheight(){
        return height;
    }

    public double surfacearea(){
        return 2*Math.PI*radius*radius + 2*3.14*radius*height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}


class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 5;
        this.breadth = 4;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getlength(){
        return length;
    }

    public int getbreadth(){
        return breadth;
    }
}


public class practice6 {
    public static void main(String[] args) { 
       
       /*  Cylinder cy = new Cylinder();
        cy.setheight(10);
        cy.setradius(15);
        System.out.println(cy.getheight());
        System.out.println(cy.getradius());
        

        //Question 2
        System.out.println("The surface area of cylinder is: " + cy.surfacearea());
        System.out.println("The volume of cylinder is: " + cy.volume());
        */

        //Question 3
        Rectangle r = new Rectangle();
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());
        Rectangle r1 = new Rectangle(12,56);
        System.out.println(r1.getlength());
        System.out.println(r1.getbreadth());
    }    
}
