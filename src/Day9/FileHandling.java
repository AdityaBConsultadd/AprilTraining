package Day9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
// File
//    FileWriter
//    FileReader
    /**
     * Create
     * delete
     * Write
     * Read
     * */
public static void main(String[] args) throws IOException {
    File file = new File("Test.csv");
    if(file.createNewFile()){
        System.out.println("File Created");
    }else
        System.out.println("File Exists");

//    if(file.delete()){
//        System.out.println("Deleted");
//    }else
//        System.out.println("File not found");

    System.out.println(file.canExecute());
    System.out.println(file.canRead());
    System.out.println(file.getPath());
    System.out.println(file.setReadOnly());
    System.out.println(file.canRead());

//    write
    System.out.println(file.exists());
    FileWriter fileWriter = new FileWriter("Test.txt",true);
    fileWriter.write("Hey\n");
    fileWriter.write("Hey my name is aditya\n");
    fileWriter.close();

//  Read

    FileReader fileReader = new FileReader("Test.csv");
    Scanner in = new Scanner(fileReader);
    int i=0;
    int total=0;
    while (in.hasNext()){
        String s = in.nextLine();
        String re[]=s.split(",");
//        System.out.println(re[2]);
        if (i==0){
            i++;
           continue;
        }else{
        int j= Integer.parseInt(re[2]);
//        System.out.println(j);
        total=total+j;};
//        System.out.println(s);
    }
    System.out.println(total);

    float avg=0;
    int sum=0;

//    FileReader fileReader1 = new FileReader("Test.csv");
//    Scanner in1 = new Scanner(fileReader1);
//    int c;
//    int count=0;
//    String s1="";
//    boolean flag=true;
//    while (in1.hasNext()){
//        if(flag){
//            flag=false;
//            continue;
//        }
//        String s=in1.nextLine();
////        System.out.print(c);
////        System.out.print((char)c);
////        System.out.print(" "+(char)c);
////        s1 =""+(char)c;
//        String res[] = s.split(",");
//        sum = sum+Integer.parseInt(res[2]);
////        ++count;
//
////        System.out.println(s1);
//    }
////    System.out.println(s1);
//    System.out.println("Hey the total marks in maths = "+sum);
////    System.out.println("Average is "+sum/count);


}
}
