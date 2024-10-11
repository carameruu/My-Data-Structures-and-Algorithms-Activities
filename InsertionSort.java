import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to input the number of elements in the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        // Create an array of size 
        int[] array = new int[n];
        
        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Call the insertion sort method 
        insertionSort(array);

        // Print the sorted array
        System.out.println("Insertion sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        
        sc.close();
    }
    
    // Method to perform Insertion Sort on an array
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i]; 
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
