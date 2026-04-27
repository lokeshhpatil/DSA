public class second_large_element {
  public static void main(String[] args) {
    // int[] arr = { 11, 12, 43, 54, 67, 54, 1, 2, 32, 56, 87, 9, 5, 6, 87, 87, 67,
    // 76, 67, 0, 1, 1, 1, 0 };
    int[] arr = { 5, 5, 5 };
    int[] max = second_large(arr);
    for (int num : max) {
      System.out.print(" " + num);
    }
    // System.err.println(max);

  }

  static int[] second_large(int[] arr) {
    int max = Integer.MIN_VALUE;
    int second_max = Integer.MIN_VALUE;
    int small = Integer.MAX_VALUE;
    int sc_small = Integer.MAX_VALUE;

    for (int num : arr) {
      if (num > max) {
        int temp = max;
        max = num;
        second_max = temp;
      } else if (num > second_max && num != max) {
        second_max = num;
      }

      if (num < small) {
        int temp = small;
        small = num;
        sc_small = temp;
      } else if (num < sc_small && num != small) {
        sc_small = num;
      }
    }

    if (second_max == Integer.MIN_VALUE)
      second_max = -1;
    if (sc_small == Integer.MAX_VALUE)
      sc_small = -1;
    return new int[] { second_max, sc_small };
  }
}
