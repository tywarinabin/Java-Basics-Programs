import java.util.Scanner;
/*
 
The print pattern is as follow :  
                
                
                
                *******
                ******
                *****
                ****
                ***
                **
                *
 
 


*/



public class Print_Pattern {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number : ");
        int a = sc.nextInt();
        for(int i = a ;i>=0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("These");
            }
            System.out.println(" ");
        }
        
    }
}
