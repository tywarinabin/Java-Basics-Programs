import java.util.Scanner;
public class StringBuilders {
    public static void main(String args[]){
        System.out.println("Hello Strings");
        StringBuilder str = new StringBuilder("Nabin Tiwari");
        System.out.println(str.charAt(10));
       str.setCharAt(10, 'N');
       System.out.println(str);
       str.insert(1,'N');
        System.out.println(str);
    }
}
