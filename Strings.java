import java.util.Scanner;
public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first and Last Name : ");
        String first_name = sc.nextLine();
        String last_name = sc.nextLine();
        if(first_name.compareTo(last_name) == 0){
            System.out.println("Strings are Equal.");
        }
        else if(first_name.compareTo(last_name)>0){
        System.out.println("String 1 is Greater");
        }
        else{
            System.out.println("String 2 is Greater");
        }
        String Full_Name = first_name+"  "+last_name;
        System.out.println(Full_Name);

// atChar function is used to find out the character at Particular Index on the String.

        for(int i = 0;i!=Full_Name.length();i++){
            System.out.print(Full_Name.charAt(i)+" ");
        }
    }
}
