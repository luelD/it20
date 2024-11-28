package topic_6_sorting;

import java.util.Scanner;

public class InsertionSort {
    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to get user input for the array
    public static int[] getInputArray() {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        // Ask user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        return arr;
    }

    public static void main(String[] args) {
        // Get input array from user
        int[] arr = getInputArray();
        
        // Print original array
        System.out.println("Original array:");
        printArray(arr);

        // Perform insertion sort
        insertionSort(arr);

        // Print sorted array
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
