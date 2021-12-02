import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1{
  public static void main(String[] args) {
    String fileName = args[0];
    int total = 0;
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      int initial = 1000000;
      while (input.hasNextLine()){
        int num = Integer.parseInt(input.nextLine());
        if (num > initial){
          total++;
        }
        initial = num;
      }
    }
    catch (FileNotFoundException ex) {
      System.out.println("Not a valid file name");
    }
    System.out.println(total);
  }
}
