def main():
  arr = [1,5,6,7,9,4]
  selection_sort(arr)
  print(arr)

def selection_sort(arr):
  n = len(arr)
  for i in range(0, n - 1):
    mini = i
    for j in range(i + 1, n):
      if(arr[j] < arr[mini]):
        mini = j
    
    arr[i], arr[mini] = arr[mini], arr[i]



if __name__ == "__main__":
  main()