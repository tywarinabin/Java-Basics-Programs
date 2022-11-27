import java.util.Random;
import java.util.Scanner;
public class Scissor_Paper_Rock {
   public static void main(String[] args) {
       Random r = new Random();
       Scanner s = new Scanner(System.in);
       System.out.println();
       System.out.println();
       boolean userSatisfied = true;
       while(userSatisfied){
           int C = r.nextInt(1, 4);
    System.out.println("Enter the following Option: ");
    System.out.println("For Scissor : 1");
    System.out.println("For Paper : 2");
    System.out.println("For Rock : 3");
    System.out.print("Enter  Here   : -------->>       ");
    int U  = s.nextInt();
    if(U == C){
        System.out.println("Draw .");
    }
    else if((U == 1 && C == 2)  || (U == 3 && C == 1)  ||  (U == 2 && C == 3) ){
        System.out.println("You Win.");
    }
    else{
        System.out.println("Computer Win.");
    }
    System.out.println();
    System.out.println(C);
       }
   }
}
