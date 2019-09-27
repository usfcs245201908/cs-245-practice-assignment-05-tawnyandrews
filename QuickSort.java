public class QuickSort implements SortingAlgorithm {
     
    int[] a;
    int length;
 
    public void sort(int[] inputArray) 
    {
         
        if (inputArray == null || inputArray.length == 0) 
        {
            return;
        }
        this.a = inputArray;
        length = inputArray.length;
        quickSort(0, length - 1);
    }
 
    void quickSort(int start, int end) 
    {
         
        int i = start;
        int j = end;
        int pivot = a[start+(end-start)/2];

        while (i <= j) 
        {
            while (a[i] < pivot) 
            {
                i++;
            }
            while (a[j] > pivot) 
            {
                j--;
            }
            if (i <= j) 
            {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (start < j)
            quickSort(start, j);
        if (i < end)
            quickSort(i, end);
    }
 
    private void exchangeNumbers(int i, int j) 
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}