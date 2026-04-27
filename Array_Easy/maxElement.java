// package Array.Easy;

public class maxElement {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int max = quick_sort(arr, 0, arr.length - 1);
    System.err.println(max);
  }

  static int quick_sort(int[] arr, int low, int high) {
    qs(arr, 0, arr.length - 1);
    return arr[arr.length - 1];
  }

  static void qs(int[] arr, int low, int high) {
    if (low < high) {
      int pivotElement = partition(arr, low, high);
      qs(arr, low, pivotElement - 1);
      qs(arr, pivotElement + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;
    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }
      while (arr[j] > pivot && j >= low + 1) {
        j--;
      }
      if (i < j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }

    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }
}