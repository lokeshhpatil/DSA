public class Largest_Element {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int res = largestElement(arr);
    System.out.println(res);

  }

  static int largestElement(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
      if (num > max)
        max = num;
    }
    return max;
  }
}
