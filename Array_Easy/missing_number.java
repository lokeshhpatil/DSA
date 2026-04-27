// import java.util.Arrays;

public class missing_number {
  public static void main(String[] args) {
    int[] arr = { 0, 2, 3, 1, 4, 5, 6, 10, 8, 7 };
    int res = missingNumber(arr);
    System.out.println(res);
  }

  static int missingNumber(int[] nums) {
    int n = nums.length;
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }

    // n * (n + 1) / 2
    int expSum = n * (n + 1) / 2;

    return (int) (expSum - sum);
  }
}
