import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root (largest) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // Root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 8, 7, 2, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        heapSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}