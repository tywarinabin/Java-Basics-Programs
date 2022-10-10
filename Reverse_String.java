public class Reverse_String {
    public static void reverse(String s, int n){
        if(n==0){
            System.out.print(s.charAt(n));
            return;
        }
        System.out.print(s.charAt(n));
        reverse(s, n-1);
    }
    public static void main(String args[]) {
        String str = "LAPEN";
        reverse(str,str.length()-1);
    }
}
