public class remove_dublicate {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4 };

    int idx = removeDublicate(arr);
    System.out.print(idx);
    System.out.println();
  }

  static int removeDublicate(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        i++;
        nums[i] = nums[j];
      }
    }
    for (int n : nums) {
      System.out.print(" " + n);
    }
    System.out.println();
    return i + 1;
  }

  // static int[] duplicate(int[] arr) {
  // Set<Integer> set = new HashSet<>();

  // for (int num : arr) {
  // set.add(num);
  // // System.out.print(" " + num);
  // }

  // int[] result = new int[set.size()];
  // int k = 0;

  // for (int num : set) {
  // result[k++] = num;
  // }

  // return result;
  // }
}
