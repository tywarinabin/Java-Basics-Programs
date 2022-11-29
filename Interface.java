 interface Electric {
    public void getIdNumber(String s);
}
interface Vechile{
int SpeedUp(int up);
int Brake(int down);
}
 class Car implements Vechile,Electric{
    int speed = 123;
   public int SpeedUp(int up){
    System.out.println("Increasing Vechile Speed: " + up);
        speed+=up;
        return speed;
    }
    public int Brake(int low){
        System.out.println("Applying Brake : "+low);
        speed-=low;
        return speed;
    }
    public void getIdNumber(String name){
        System.out.print("Your Vechile is Electric and Your ");
        System.out.println("Vechile Number Id is :   "+name);
    }

}
public class Interface {
    public static void main(String[] args) {
       Car v = new Car();
       System.out.println("Current Speed : "+v.SpeedUp(67));
       System.out.println("Current Speed : "+v.Brake(23));
       String name = "GA 1 PA   1432 ";
       v.getIdNumber(name);
    }
}
