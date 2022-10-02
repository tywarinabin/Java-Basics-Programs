import java.util.Scanner;
public class Pattern_02 {

    /*                       Logic of the PROBLEM
    
                    *         -> 3 space & 1 star
                   **         -> 2 space & 2 star
                  ***         -> 1 space & 3 star
                 ****         -> 0 space & 4 star
                
    */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1 ;i<=n;i++){
        for(int j = 1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
