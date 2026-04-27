public class array_left_rotate{
  static class Solution {
    // public void rotateArrayByOne(int[] nums) {
    //     int n = nums.length;
    //     for(int i = 0; i < n - 1; i++){
    //         int temp = nums[i + 1];
    //         nums[i + 1] = nums[i];
    //         nums[i] = temp;
    //     }
    // }

    public void rotateArrayByOne(int[] nums) {
      int temp = nums[0];
      int n = nums.length;
      for(int i = 1; i < n; i++){
        nums[i - 1] = nums[i];
      }
      nums[n-1] = temp;
    }

        static void rotateArray(int[] nums, int k) {
          int n = nums.length;
          k = k % n;
        int[] temp = new int[k];
        // int j = 0;
        for(int i = 0; i < k; i++){
          temp[i] = nums[i];

        }
        for(int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }
        for(int i = 0 ; i < k; i++){
          nums[n - k + i] = temp[i];
        }
    }
}

public static void main(String[] args) {
  Solution s = new Solution();
  int[] arr = {-1, 0, 3, 6};
  s.rotateArray(arr, 2);
  for(int n : arr){
    System.out.print(" " + n);
  }
}
}