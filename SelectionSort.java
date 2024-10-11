import java.util.Scanner;

public class SelectionSort {
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
        
        // Call selectionSort method 
        selectionSort(array);

        // Print the sorted array
        System.out.println("Selection sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        sc.close();  
    }
    
    // Selection Sort algorithm
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;  
                }
            }
            // Swap the minimum element with the first element of the unsorted part
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
}
