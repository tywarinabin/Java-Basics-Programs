import java.util.*;
public class flag_of_Nepal{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number to print Flag :  ");
  int n = sc.nextInt();
  System.out.println("          @");
  for(int i = 1;i<=n;i++){
    for(int j = 1;j<=i;j++){
        if(j==1){
            System.out.print("          ");
        }
        System.out.print("@@");
    }
    System.out.println();
  }
  System.out.println("          @");
  for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
          if (j == 1) {
              System.out.print("          ");
          }
          if(i==5 && j==3){
            System.out.print("  ");
          }
          else
          System.out.print("@@");
      }
      System.out.println();
  }
  System.out.println("          ##");
  System.out.println("          ##");
  System.out.println("          ##");
  System.out.println("          ##");
  System.out.println("          ##");
  System.out.println("          ##");
  System.out.println("          ##");
  }


}