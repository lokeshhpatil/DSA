package Array_Medium;

import java.util.Arrays;

public class two_sum {
  public static void main(String[] args) {
    int[] arr = { 2, 7, 11, 15 };
    int target = 11;
    // int[] index = sum_two(arr, target);
    // for (int num : index) {
    // System.out.print(" " + num);
    // }
    System.out.println(is_target(arr, target));

  }

  static int[] sum_two(int[] nums, int target) {

    int n = nums.length;
    // int left = 0;
    // int right = 0;
    long sum = Integer.MIN_VALUE;
    // 2,7,11,15
    // tareget = 9
    if (target == nums[0])
      return new int[] { 0, 0 };
    for (int i = 0; i < n; i++) {
      if (nums[i] == target)
        return new int[] { i };
      for (int j = 0; j < n; j++) {
        sum = nums[i] + nums[j];
        if (sum == target) {
          return new int[] { i, j };
        }
      }
    }
    // target not found;
    return new int[] { -1, -1 };
  }

static boolean is_target(int[] nums, int target) {
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int sum = nums[left] + nums[right];
        if (sum == target) {
            return true;
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    for(int num: nums) {
      if(num == target)
        return true;
    }
    return false;
}

}
