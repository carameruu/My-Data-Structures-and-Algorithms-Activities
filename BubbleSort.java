import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Ask the user to input number of elements in the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        //Create a size of an array
        int[] array = new int[n];
        
        //Ask the user to input elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        bubbleSort(array); // Call the bubbleSort method
       
        //Print the sorted array
        System.out.print("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " "); 
        }
    }

    // Bubble sort method
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
