package lp2com;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {
  void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  // driver code
  public static void main(String args[]) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of elements in the array");
    n=sc.nextInt();
    System.out.println("enter the elements in array");
    int[] data=new int[n];
    for(int i=0;i<n;i++) {
    	data[i]=sc.nextInt();
    }
    SelectionSort ss = new SelectionSort();
    ss.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}
