import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Map;

public class inter_section {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 2, 3, 3, 4, 5, 6 };
    int[] nums2 = { 2, 3, 3, 5, 6, 6, 7 };
    int[] result = intersection(nums1, nums2);
    for (int num : result) {
      System.out.print(" " + num);
    }
  }

  static int[] intersection(int[] nums1, int[] nums2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();

    for (int num : nums1) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    for (int num : nums2) {
      if (map.containsKey(num) && map.get(num) > 0) {
        list.add(num);
        map.put(num, map.get(num) - 1);
      }
    }

    int[] inter = new int[list.size()];
    int x = 0;
    for (int num : list) {
      inter[x] = num;
      x++;
    }

    return inter;
  }
}
