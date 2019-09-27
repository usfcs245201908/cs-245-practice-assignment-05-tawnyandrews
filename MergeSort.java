public class MergeSort implements SortingAlgorithm {
     
    int[] a;
    int[] tempMergArr;
    int length;
 
    public void sort(int[] inputArray) 
    {
        this.a = inputArray;
        this.length = inputArray.length;
        this.tempMergArr = new int[length];
        sort(0, length - 1);
    }
 
    void sort(int start, int end) 
    {
         
        if (start < end) 
        {
            int mid = start + (end - start) / 2;
            sort(start, mid);
            sort((mid+1), end);
            merge(start, mid, end);
        }
    }
 
    void merge(int start, int mid, int end) 
    {
 
        for (int i = start; i <= end; i++) 
        {
            tempMergArr[i] = a[i];
        }
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) 
        {
            if (tempMergArr[i] <= tempMergArr[j]) 
            {
                a[k] = tempMergArr[i];
                i++;
            } 
            else 
            {
                a[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) 
        {
            a[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}