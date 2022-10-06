import java.util.*;
public class last_first
{
	public static void main(String[] args) {
		Scanner nep = new Scanner (System.in);
		int n = nep.nextInt();
		if(n>=10 && n<100){
		        System.out.print(n);
		    }
		    else if(n<10){
		        System.out.println("Invalid Number");
		    }
		    else{
		        int last = n%10;
		        int first = 0;
		while(n!=0){
		  first = n;
		  n/=10;
		   
		}
		System.out.print(first*10+last);
		    }
	}
}