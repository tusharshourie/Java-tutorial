class Student{
    private int id;
    private String name;

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
public class accessspecifiers {
    public static void main(String[] args) {
        Student Tushar = new Student();
        // Tushar.id=55;
        // Tushar.name = "Teo shourie"  //throws an error due to priv acc modi
        Tushar.setid(56);
        Tushar.setname("guddu");
        System.out.println(Tushar.getid());
        System.out.println(Tushar.getname());
    }
    
}
