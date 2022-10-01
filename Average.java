import java.util.*;
public class Average {
public static int findaverage(int a, int b, int c){
int average = (a+b+c)/3;
return average;
}

    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
System.out.println(findaverage(a, b, c));
    }

}