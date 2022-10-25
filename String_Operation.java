import java.util.Scanner;
public class String_Operation{
    public static void main(String args[]){
        String name = new String("   Nabin Tiwari");
        // This trim function is used to remove space from the beginning of the String.
        System.out.println(name.trim());
        //  Substring Function is used to find out the smallest part of the String.
        System.out.println(name.substring(0,8));
        // Replace a character Space with '$' Sign.
        System.out.println(name.replace(' ', '$'));
        // We also can replace name with other name through Replace function.
        System.out.println(name.replace("Nabin", "Abinash"));
        // startsWith() function return true if it is ture and false if it is.
        System.out.println(name.startsWith("Nabin"));  // False , it Starts with space.
        // endswith() function return false if it's condition not meet otherwise it  will true.
        System.out.println(name.endsWith("i"));
        // charAt(index)  function is used to find out which character is at particular index.
        System.out.println(name.charAt(6));
        // the function indexOf() function i sused to find out the index of any character starting point.
        System.out.println(name.indexOf("t"));  // We have T but not t.
        // indexOf (stringName, startingIndex) is also used to find the index at any index of the string.
        System.out.println(name.indexOf('n', 5));
        // lastIndexOf('2', fromIndex ) is used to find the last index of the elements.
        // Traversal starting from last of the String on case of lastIndexOf('', fromIndex);  
        System.out.println(name.lastIndexOf("N", 5));
        // Equal function is used to check the two string if they are equal or not.
        System.out.println(name.equals("   Nabin Tiwari"));
        // When there is no any case sensitive equal check i.e either it would  be capital or small
        // we use another function calle equalIgnoreCase(STRING) .
        System.out.println(name.equalsIgnoreCase("   Nabin tiwari"));
    }
}