// public package Array_Easy;

import java.util.Arrays;
import java.util.HashSet;

class unior_array {
  public static void main(String[] args) {
    int[] nums1 = { 50, 10, 40 };
    int[] nums2 = { 30, 20 };
    int[] result = union(nums1, nums2);
    for (int num : result) {
      System.out.print(" " + num);
    }

  }

  static int[] union(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums1.length; i++) {
      set.add(nums1[i]);
    }
    for (int i = 0; i < nums2.length; i++) {
      set.add(nums2[i]);
    }
    int[] result = new int[set.size()];
    int k = 0;
    for (int num : set) {
      result[k++] = num;
    }

    Arrays.sort(result);
    return result;
  }

}