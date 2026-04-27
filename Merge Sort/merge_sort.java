public class merge_sort {
  public static void main(String[] args) {
    int[] arr = { 6, 5, 4, 6, 7, 8, 3, 2 };
    int n = arr.length;
    mergeSort(arr, 0, n - 1);
    for (int num : arr) {
      System.out.print(" " + num);
    }

  }

  static void mergeSort(int[] arr, int low, int high) {
    if (low >= high)
      return;
    int mid = (low + high) / 2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid + 1, high);

    merge(arr, low, mid, high);
  }

  static void merge(int[] arr, int low, int mid, int high) {
    int left = low;
    int right = mid + 1;
    int[] temp = new int[high - low + 1];
    int k = 0;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp[k] = arr[left];
        left++;
        k++;
      } else {
        temp[k++] = arr[right++];
      }
    }

    while (left <= mid) {
      temp[k++] = arr[left++];
    }
    while (right <= high) {
      temp[k++] = arr[right++];
    }

    for (int i = low; i <= high; i++) {
      arr[i] = temp[i - low];
    }
  }
}