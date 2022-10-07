import java.util.Scanner;
class Array_on_JavaBasics{
  public static void main(String[] args) {
    Scanner nep = new Scanner(System.in);
    System.out.println("Enter the size of Array: ");
    int size = nep.nextInt();
    /*
        Decleration of Array of Size 5
    int [] arr = new int [5];
    int arr1[] = new int [5];
      
    Initialize the value of array by 5 elements

    int arr2[] = {1,2,3,4,5}; 

*/
int arr[] = new int [size];
System.out.println("Enter the elements of Array : ");
for(int i = 0;i<size;i++){
    // Input value to the array and Assigned to the array index.
    arr[i] = nep.nextInt();
}
System.out.println("Elemets of the Arrays are : ");
for(int i = 0;i<size;i++){
    System.out.print(arr[i]+ "  ");
}
System.out.println("Do you want to Search element in Array : ");
System.out.println("Enter 1 for Yes and 0 for No");
int check   = nep.nextInt();
if(check ==1){
    System.out.println("Enter element to Search: ");
    int checker = nep.nextInt();
    for(int i = 0;i<size ;i++){
        if(arr[i] == checker){
            System.out.println("Element found at index  "+ i);
            break;
        }
    }
}
  }

}