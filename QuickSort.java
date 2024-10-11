import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input number of elements in the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        // Create an array of size 
        int[] array = new int[n];
        
        // Ask the user to input elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Call quickSort 
        quickSort(array, 0, n - 1);

        // Print the sorted array
        System.out.println("Quick sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        sc.close();  
    }
    
    // Quick Sort algorithm
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];  ++
        int i = (low - 1);  
        
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap the pivot element with the element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;  
    }
}
