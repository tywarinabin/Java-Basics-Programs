import java.util.Scanner;
public class TwoDArray {
    public static void main(String [] args){
    Scanner nep = new Scanner(System.in);
    System.out.print("Enter the row and columns: ");
    int row = nep.nextInt();
    int colms = nep.nextInt();
    int arr[][] = new int [row][colms];
    System.out.println("Enter elements of array: ");
     for(int i = 0;i<row;i++){
        for(int j = 0;j<colms;j++){
            arr[i][j] = nep.nextInt();
        }
    }
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < colms; j++) {
            System.out.print(arr[i][j] + "   ");
        }
        System.out.println();
    }
}
}
