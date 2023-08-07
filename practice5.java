class Employee1{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public String setname(String n){
        name = n;
        return n;
    }
}

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("Calling friend");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}


public class practice5 {
    public static void main(String[] args) {
        /*
         //Question 1
        Employee1 tushar = new Employee1();
        tushar.setname("Teo shourie");
        tushar.salary = 8989;
        System.out.println(tushar.getname()); 
        System.out.println(tushar.getsalary());

        //Question 2
        cellphone vivo = new cellphone();
        vivo.callfriend();
        vivo.ring();
        vivo.vibrate();
        */

        //Question 3
        square s1 = new square();
        s1.side = 5;
        System.out.println(s1.area());
        System.out.println(s1.perimeter()); 
    }
    
}
