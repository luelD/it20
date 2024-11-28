package topic_6_sorting;

import java.util.Scanner;

public class MergeSort {
    // Method to perform Merge Sort
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    // Merge helper method
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
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

        // Perform merge sort
        mergeSort(arr);

        // Print sorted array
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
