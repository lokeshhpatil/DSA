// package Bubble_Sort;

public class bubble_sort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 6, 7, 2, 3, 7 };
    bubbleSort(arr);
    for (int num : arr) {
      System.out.print(" " + num);
    }

  }

  static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}
