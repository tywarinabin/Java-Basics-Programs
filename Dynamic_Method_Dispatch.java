class Phone{
    void Ring(){
        System.out.println("Beep Sounds");
    }
    
    void ShowTime() {
        System.out.println("The time is -->  08 : 34  PM");
    }
    void switchON(){
        System.out.println("Phone is Switched Off.");
    }
}
class Iphone extends Phone{
    @Override
    void Ring(){
        System.out.println("iPhone Ringing");
    }
    @Override
    void ShowTime() {
        System.out.println("Time on iPhone is  -->  08 : 34 : 59 PM");
    }
    void PassCode(){
        System.out.println("Passcode for iPhone is  125678");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Iphone p = new Iphone();
        p.switchON();
        p.Ring();
    }
}
