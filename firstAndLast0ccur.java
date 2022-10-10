public class firstAndLast0ccur {
    public static int first = -1;
    public static int last = -1;
    public static void Occurance(String s, int index , char element) {
        if(index == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = s.charAt(index);
        if(current == element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        Occurance(s, index+1, element);
    }
    public static void main (String args[]) {
        String str = "abcdaafghaak";
        Occurance(str,0,'a');
    } 
        
    
}
