public class SelectionSort
{
    public void sort(int A[])
    {
        int n = A.length;

        for (int j = 0; j < n - 1; j++)
        {
            int min_idx = j;

            for (int i = j + 1; i < n; i++)
            {
                if (A[i] < A[min_idx])
                {
                    min_idx = i;
                }
            }
            int temp = A[min_idx];
            A[min_idx] = A[j];
            A[j] = temp;
        }
    }

    public void printArray(int[] A)
    {
        int n = A.length;

        for (int i = 0; i < n; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = {64,25,12,22,11}; 
        System.out.println("Array:"); 
        ob.printArray(arr); 
        ob.sort(arr); 
        System.out.println("Sorted array:"); 
        ob.printArray(arr); 
    } 
}