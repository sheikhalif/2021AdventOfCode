import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2{
  public static void main(String[] args) {
    String fileName = args[0];
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      int forward = 0;
      int down = 0;
      while (input.hasNextLine()){
        String line = input.nextLine();
        String[] words = line.split(" ");
        if (words[0].equals("forward")){
          forward += Integer.parseInt(words[1]);
        }
        if (words[0].equals("down")){
          down += Integer.parseInt(words[1]);
        }
        if (words[0].equals("up")){
          down -= Integer.parseInt(words[1]);
        }
      }
      System.out.println(forward*down);
    }
    catch (FileNotFoundException ex) {
      System.out.println("Not a valid file name");
    }
  }
}
