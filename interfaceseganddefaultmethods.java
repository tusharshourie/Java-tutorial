interface camera{
    void takesnap();
    void recordvid();
}
interface wifi{
    String[] getnetworks();
    void connecttoonenetwork(String network);
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("Calling" + phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting.....");
    }
    // void takesnap(){
    //     System.out.println("Taking snap");
    // }
}
class smartphone extends mycellphone implements wifi, camera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordvid(){
        System.out.println("Recording");
    }
    public String[] getnetworks(){
        System.out.println("getting list of networks: ");
        String[] networklist = {"tushar", "teo"};
        return  networklist;
    }
    public void connecttoonenetwork(String network){
        System.out.println("Connecting to "+ network);
    }
}
public class interfaceseganddefaultmethods {
    public static void main(String[] args) {
        smartphone ms = new smartphone();
        String[] ar = ms.getnetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
