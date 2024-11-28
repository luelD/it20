package topic_6_sorting;

import java.util.Scanner;

public class BubbleSort {
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to read an array from user input
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

        // Perform bubble sort
        bubbleSort(arr);

        // Print sorted array
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
