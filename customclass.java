class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("My id is " + id);
        System.out.println("my name is "+ name);
    }
    public int getsalary(){
        return salary;
    }
}
public class customclass {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee tushar = new Employee(); //instantiating a new employee object
        //setting properties
        tushar.id=55;
        tushar.salary=500000;
        tushar.name="teo shourie";
        int salary=tushar.getsalary();
        // System.out.println(tushar.id);
        tushar.printdetails();
        System.out.println(salary);
    }
    
}
