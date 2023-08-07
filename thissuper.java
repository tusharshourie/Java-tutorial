class Ekclass{
    int a;
    Ekclass(int a){
        this.a=a;
    }

    public int geta(){
        return a;
    }
    public int returnone(){
        return 1;
    }
}

class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("I am a constructor");
    }
}
public class thissuper {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        // Doclass d = new Doclass(56);
        System.out.println(e.geta());
    }
    
}
