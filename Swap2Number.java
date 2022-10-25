import java.util.Scanner;
public class Swap2Number{
public static void main(String nep[]) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the value of A : ");
int a = sc.nextInt();
System.out.println("Enter the value for B: ");
int b = sc.nextInt();

System.out.println("The value of a  =  " + a);
System.out.println("The value of b  =  " + b);

a = a+b;
b = a-b;
a = a-b;
System.out.println("The value of a  =  "+a);
System.out.println("The value of b  =  " + b);

 }
}