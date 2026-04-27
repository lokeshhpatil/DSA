class selectionSort {
  public static void main(String[] args) {
    int[] arr = { 5, 4, 3, 2, 1, 9, 7, 5 };
    selection_sort(arr);

    for (int num : arr) {
      System.out.print(" " + num);

    }

  }

  static void selection_sort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int mini = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[mini]) {
          mini = j;
        }
      }
      int temp = arr[mini];
      arr[mini] = arr[i];
      arr[i] = temp;
    }
  }
}