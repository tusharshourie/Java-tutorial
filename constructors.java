class MyStudent{
    private int id;
    private String name;

    public MyStudent(){
        id = 45;
        name = "Your name here";
    }

    public MyStudent(String myname, int myid){
        id = myid;
        name = myname;
    }


    public MyStudent(String myname){
        id = 0;
        name = myname;
    }

    public String getname(){
        return name;
    }
    public void setname(String n){
        this.name = n;
    }
    public void setid(int i){
        this.id = i;
    }
    public int getid(){
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {
        // MyStudent Teo = new MyStudent();
        // MyStudent Teo = new MyStudent("Guddu Sharma", 69);
        MyStudent Teo = new MyStudent("Tushar Bhai");
        System.out.println(Teo.getid());
        System.out.println(Teo.getname());
    }
    
}
