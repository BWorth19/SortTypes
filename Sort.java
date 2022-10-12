
public class Sort 
{

	public static void main(String[] args) 
	{
		int arr1[] = { 12, 11, 13, 5, 6, 1, 45, 10, 34 };
		int arr2[] = { 12, 11, 13, 5, 6, 1, 45, 10, 34 };
		int arr3[] = { 12, 11, 13, 5, 6, 1, 45, 10, 34 };
		int arr4[] = { 12, 11, 13, 5, 6, 1, 45, 10, 34 };
		int N = arr1.length;

		int c1 = insertionSort(arr1, N);
		printArray(arr1, N, c1);
		
		int c2 = bubbleSort(arr2);
		printArray(arr2, N, c2);
		
		int c3 = selectionSort(arr3);
		printArray(arr3, N, c3);
		
		int c4 = shellSort(arr4);
		printArray(arr4, N, c4);
		
	}
	
	public static int insertionSort(int arr[], int n)
	{
		int count = 0;
	    int i, key, j;
	    for (i = 1; i < n; i++)
	    {
	        key = arr[i];
	        j = i - 1;

	        while (j >= 0 && arr[j] > key)
	        {
	            arr[j + 1] = arr[j];
	            j = j - 1;
	        }
	        arr[j + 1] = key;
	        count++;
	    }
        return count;
	}
	 
	public static int bubbleSort(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            count++;
        }
        return count;
    }
	
	public static int selectionSort(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                {
                    min_idx = j;
                }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            count++;
        }
        return count;
    }
	
	public static int shellSort(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
                count++;
            }
        }
        return count;
    }

	static void printArray(int arr[], int n, int count)
	{
	    int i;
	 
	    for (i = 0; i < n; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	    System.out.println("Times of Swaps: " + count);
	}
}
