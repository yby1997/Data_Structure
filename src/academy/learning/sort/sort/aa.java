package academy.learning.sort.sort;

import java.util.Arrays;

public class aa {
    public static void main(String[] args) {
        int[] a = {1, -2, 5,5, 6, 7};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = lo - 1;
        for (int j = lo; j < hi; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, hi);
        return i + 1;

    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo < hi) {
            int pivotIndex = partition(arr, lo, hi);
            quickSort(arr, lo, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, hi);
        }
    }
}
