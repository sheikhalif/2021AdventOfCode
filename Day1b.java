import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1b{
  public static void main(String[] args) {
    String fileName = args[0];
    int total = 0;
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      int initial = 10000000;
      int[] nums = new int[2000];
      int index = 0;
      while(input.hasNextLine()){
        nums[index] = Integer.parseInt(input.nextLine());
        index++;
      }
      for(int i = 0; i < 1998; i++){
        System.out.println("first number is: "+nums[i]);
        System.out.println("second number is: "+nums[i+1]);
        System.out.println("third number is: "+nums[i+2]);
        int currentSum = nums[i] + nums[i+1] + nums[i+2];
        System.out.println("current sum is: "+currentSum);
        if (currentSum > initial){
          total++;
          System.out.println("change was counted");
        }
        initial = currentSum;
        System.out.println("\n");
      }
    }
    catch (FileNotFoundException ex) {
      System.out.println("Not a valid file name");
    }
    System.out.println(total);
  }
}
