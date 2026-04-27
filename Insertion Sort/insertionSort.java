// package Insertion Sort;

public class insertionSort {
  public static void main(String[] args) {

    int[] arr = { 6, 5, 4, 3, 2, 1, 10, 9, 8, 7, 6, 5 };
    insertion_sort(arr);
    for (int num : arr) {
      System.out.print(" " + num);
    }

  }

  static void insertion_sort(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
      // int j = i;
      while (i > 0 && arr[i - 1] > arr[i]) {
        int temp = arr[i - 1];
        arr[i - 1] = arr[i];
        arr[i] = temp;

        i--;
      }
    }
  }
}
