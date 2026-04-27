public class insertion_sort_recursion {
  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    int n = arr.length;

    System.out.println("Before sorting array: ");
    for (int num : arr) {
      System.out.print("-> " + num);
    }
    System.out.println();

    System.out.println("After sorting array: ");
    insertion_sort(arr, 0, n);
    for (int num : arr) {
      System.out.print("-> " + num);
    }
  }

  static void insertion_sort(int[] arr, int i, int n) {
    int j = i;
    if (i == n)
      return;

    while (j > 0 && arr[j - 1] > arr[j]) {
      int temp = arr[j - 1];
      arr[j - 1] = arr[j];
      arr[j] = temp;

      j--;
    }

    insertion_sort(arr, i + 1, n);

  }
}
