import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3{
  public static void main(String[] args) {
    String fileName = args[0];
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      int[] arr1 = new int[1000]{};
      int[] arr2 = new int[1000]{};
      int[] arr3 = new int[1000]{};
      int[] arr4 = new int[1000]{};
      int[] arr5 = new int[1000]{};
      int[] arr6 = new int[1000]{};
      int[] arr7 = new int[1000]{};
      int[] arr8 = new int[1000]{};
      int[] arr9 = new int[1000]{};
      int[] arr10 = new int[1000]{};
      int[] arr11 = new int[1000]{};
      int[] arr12 = new int[1000]{};
      for (int i = 0; i < 1000; i++){
        arr1[i] = Integer.parseInt(input.nextChar());
        arr2[i] = Integer.parseInt(input.nextChar());
        arr3[i] = Integer.parseInt(input.nextChar());
        arr4[i] = Integer.parseInt(input.nextChar());
        arr5[i] = Integer.parseInt(input.nextChar());
        arr6[i] = Integer.parseInt(input.nextChar());
        arr7[i] = Integer.parseInt(input.nextChar());
        arr8[i] = Integer.parseInt(input.nextChar());
        arr9[i] = Integer.parseInt(input.nextChar());
        arr10[i] = Integer.parseInt(input.nextChar());
        arr11[i] = Integer.parseInt(input.nextChar());
        arr12[i] = Integer.parseInt(input.nextChar());
      }
