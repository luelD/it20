package topic_6_sorting;

import java.util.Scanner;

public class SelectionSort {
    
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        // Create an array of the entered size
        int[] arr = new int[n];
        
        // Ask the user to input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Display the original array
        System.out.println("Original array:");
        printArray(arr);

        // Perform selection sort
        selectionSort(arr);

        // Display the sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        scanner.close();
    }
}
