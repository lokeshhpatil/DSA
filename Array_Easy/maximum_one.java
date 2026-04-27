public class maximum_one {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 1, 1, 1, 1, 0, 1 };
    int cnt = findMaxConsecutiveOnes(nums);
    System.out.print(cnt);

  }

  static int findMaxConsecutiveOnes(int[] nums) {
    long cnt = 0;
    long maxOne = 0;
    // long n = nums.length;

    for (int num : nums) {
      if (num == 1) {
        cnt++;
      } else {
        maxOne = cnt;
        cnt = 0;
      }
    }
    return (int) Math.max(cnt, maxOne);
  }
}
