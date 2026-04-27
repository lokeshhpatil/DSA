public class bubble_sort_recursion {
  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    int n = arr.length;

    System.out.println("Before sorting array: ");
    for (int num : arr) {
      System.out.print("-> " + num);
    }
    System.out.println();

    System.out.println("After sorting array: ");
    bubble_sort(arr, n);
    for (int num : arr) {
      System.out.print("-> " + num);
    }
  }

  static void bubble_sort(int[] arr, int n) {
    boolean isSorted = false;
    if (n == 1)
      return;

    for (int j = 0; j <= n - 2; j++) {
      if (arr[j] > arr[j + 1]) {
        int temp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = temp;

        isSorted = true;
      }
    }

    if (!isSorted)
      return;
    bubble_sort(arr, n - 1);
  }
}