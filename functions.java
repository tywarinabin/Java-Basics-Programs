import java.util.Scanner;
class functions{
public static int sum (int x, int y){
    return x+y;
}
public static int multiply(int x,int y){
    return x*y;
}
public static int factorial (int n){
    if(n==1){
        return 1;
    }
    return n*factorial(n-1);
}
    public static void main(String args[] ){
        Scanner s = new Scanner (System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println(sum(num1, num2));
       System.out.print("The multiplication of " + num1 + " and "+ num2 + " is ");
        System.out.println(multiply(num1, num2));
        System.out.println("Enter number to find factorial :  ");
        int value = s.nextInt();
        System.out.println(factorial(value));
    }
    

}