public class long_subarray_sum {
  public static void main(String[] args) {
    int[] nums = { 2, 3, 5 };
    int step = longestSubarray(nums, 10);
    System.out.println(step);
  }

  static int longestSubarray(int[] nums, int k) {
    int longArrayLength = 0;
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      // int steps = 0;
      int total = 0;
      for (int j = i; j < n; j++) {
        total = total + nums[j];

        if (total == k) {
          int length = j - i + 1;
          longArrayLength = Math.max(length, longArrayLength);
        }
      }
    }
    return longArrayLength;
  }
}