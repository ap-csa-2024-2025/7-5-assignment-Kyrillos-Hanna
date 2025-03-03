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
    selectSortDescending(numList);

  }


  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void sortAndPrintDescending(String[] arr)
  {
    for (int i = 0; i < arr.length; i++) {
      String first = arr[i];
      String current = arr[i];
      int k = 0;
      for (k = i; k < arr.length; k++) {
        if (arr[k].compareTo(first) > 0) {
          first = arr[k];
        }
      }
      if (current.compareTo(first) > 0) {
        arr[i] = first;
        arr[k] = current;
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
    for (int i = 0; i < list.size(); i++) {
      int max = list.get(i);
      int current = list.get(i);
      int k = 0;
      for (k = i+1; k < list.size(); k++) {
        if (list.get(k) > max) {
          max = list.get(k);
        }
      }

      if (k != i) {
        list.set(i, max);
        list.set(k, current);
      }
    }
    System.out.print(list);
  }
}
