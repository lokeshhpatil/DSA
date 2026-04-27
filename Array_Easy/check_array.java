public class check_array {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 3, 4, 5, 13 };
    System.out.println(isSorted(arr));
    // isSorted(arr);

  }

  static boolean isSorted(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }
}
