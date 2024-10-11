import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input the number of elements in the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        // Create an array of size 
        int[] array = new int[n];
        
        // Ask the user to input elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Call mergeSort 
        mergeSort(array, 0, n - 1);

        // Print the sorted array
        System.out.println("Merge sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        sc.close();
    }

    // Recursive merge sort function
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;  
            mergeSort(array, left, mid);          
            mergeSort(array, mid + 1, right);     
            merge(array, left, mid, right);       
        }
    }

    // Function to merge two sorted subarrays
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;   
        int n2 = right - mid;     
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i = 0; i < n1; i++)
            L[i] = array[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = array[mid + 1 + j];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
