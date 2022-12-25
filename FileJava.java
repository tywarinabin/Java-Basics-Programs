import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileJava{
public static void main(String[] args)throws Exception {
Scanner sc = new Scanner(System.in);
File file = new File("JavaFile1.txt");
if(file.createNewFile()){
    System.out.println("File is created "+ file.getName());
}
else{
    System.out.println("File Already Exists.");
}
System.out.println("Path of File is  : " + file.getAbsolutePath());
if(file.exists()){
    System.out.println("File Exists");
    if(file.canRead()){
        System.out.println("File is Readable");
    }
    if(file.canWrite()){
        System.out.println("File is Writtable");
    }
    System.out.println("Length of a File is : "+ file.length());
}
}
}