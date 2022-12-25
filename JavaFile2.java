import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFile2 {
    public static void main(String[] args) throws IOException{
     File file = new File("JavaFile2.txt");

     FileWriter fileWriter = new FileWriter(file);
     // If file named   " JavaFile2.txt is not found the java Compiler will create a new File and Write on that file."
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter what do you want to write in the file named "+ file.getName());
    String str = sc.nextLine();
     fileWriter.write(str);    // It will replace the data which was already written in the file.
     fileWriter.append(str);  // This append function add data after the predata available on the file.
     // We must close the File after the operation on the file.
     fileWriter.close();
    }
}
