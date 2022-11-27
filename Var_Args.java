public class Var_Args{
 static int sum(int ...arr){    /* This function can run for any no. of arguments (ZERO Also). */
    int result = 0;
    for(int a : arr){
        result+=a;
    }
    return result;
 }
 static int mult(int a, int ...newarr){ /* This function at least take one input. */
    int result = a;
    for(int x: newarr){
        result*= x;
    }
    return result;
 }
 
 static void defination() {
System.out.println("We can also say that Variable Arguments is the modification of Method Overloading. ");
System.out.println("We can take both function declared above to implement the Var_Argument function.");
System.out.println("We can pass any number of arguments to the function  ->   sum()   and   ->mult()  "); 
}
    public static void main(String args[]){
      
        System.out.println(sum(5));
        System.out.println(mult(7,8));
        System.out.println(sum());
        System.out.println(sum(1,2,3,4,5,6));
        // System.out.println(mult())      we can't do this like because we make a function to take  atleast one argument to pass.
        defination();
    }
}