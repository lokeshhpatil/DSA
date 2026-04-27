public class quick_sort {
  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    // int n = arr.length;

    System.out.println("Before sorting array: ");
    for (int num : arr) {
      System.out.print("-> " + num);
    }
    System.out.println();

    System.out.println("After sorting array: ");
    // quickSort(arr);
    for (int num : quickSort(arr)) {
      System.out.print("-> " + num);
    }

  }

  static int[] quickSort(int[] arr) {
    qs(arr, 0, arr.length - 1);
    return arr;
  }

  static void qs(int[] arr, int low, int high) {
    if (low < high) {
      int particianIndex = partition(arr, low, high);
      qs(arr, low, particianIndex - 1);
      qs(arr, particianIndex + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
      while (arr[i] <= pivot && i <= high - 1) {
        i++;
      }

      while (arr[j] > pivot && j >= low + 1) {
        j--;
      }

      if (i < j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }

    }
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j;
  }
}