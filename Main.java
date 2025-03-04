import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] wordArr = {"forest", "apple", "willow", "lake", "trees"};
    ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(4);
    numList.add(6);
    numList.add(3);
    numList.add(7);

    sortAndPrintDescending(wordArr);
    System.out.println();
    selectSortDescending(numList);

  }


  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty /
   */
  public static void sortAndPrintDescending(String[] arr)
  {
    for (int i = 0; i < arr.length -1; i++) {
      int minIndex = i;

      for (int k = i + 1; k < arr.length; k++) {
        if (arr[k].compareTo(arr[minIndex]) > 0) {
          minIndex = k;
        }
      }

      if (i != minIndex) {
        String temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }

    for (String i : arr) {
      System.out.print(i + " ");
    }
  }

  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void selectSortDescending(ArrayList<Integer> list)
  {
    for (int i = 0; i < list.size() - 1; i++) {
      int maxIndex = i;
      for (int k = i+1; k < list.size(); k++) {
        if (list.get(k) > list.get(maxIndex)) {
          maxIndex = k;
        }
      }

      if (i != maxIndex) {
        int temp = list.get(i);
        list.set(i, list.get(maxIndex));
        list.set(maxIndex, temp);
      }
    }
    System.out.print(list);
  }
}
