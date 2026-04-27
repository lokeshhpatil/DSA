def insertion_sort(arr):
  n = len(arr)
  for i in range(0, n - 1):
    while(i > 0 and arr[i - 1 ] > arr[i]):
      arr[i], arr[i+1] = arr[i+1],arr[i]

def main():
  arr = [5,4,3,2,1,9,8,7,6,5]
  insertion_sort(arr)
  print(arr)

if __name__ == "__main__":
  main()