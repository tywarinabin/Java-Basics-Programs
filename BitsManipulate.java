import java.util.Scanner;
public class BitsManipulate{
   public static void main(String[] args) {
    System.out.println("Enter number and position : ");
    Scanner ne = new Scanner (System.in);
    int number = ne.nextInt();
    int pos = ne.nextInt();
    int bitMax = 1<<pos;
    System.out.println("Enter 1 for Get Bit and 2 for Set bit");
    int option = ne.nextInt();
    switch(option){
        case 1:{
            // Get Bit is used to find out the position of bit is either one or Zero. 
            
            if ((number & bitMax) == 0) {
                System.out.println("Bit is Zero");
            } else {
                System.out.println("Bit is One");
            }
        }
        case 2:{
            // Set Bit is used to Set the position by 1 .
            int newNbr = number | bitMax;
            System.out.println(newNbr);
        }
        case 3: {
            int notBit = ~(bitMax);
            int newNbr = notBit & number;
            System.out.println(newNbr);
        }
    }
   }
}
