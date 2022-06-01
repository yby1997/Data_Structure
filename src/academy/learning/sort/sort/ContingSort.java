package academy.learning.sort.sort;

import java.util.Arrays;

public class ContingSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
        countingSort(arr,1,10);
        System.out.println(Arrays.toString(arr));
    }

    public static void countingSort(int[] arr, int min, int max) {
        // create counting arr
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < arr.length; i++) {
            //translate value we want to count  into index in count array
            //if two 2 in arr, then increment 2 times(add 2 total) at index 0 in countarry
            countArray[arr[i] - min]++;
        }

        //when finish count, we write value back to input arr
        int j = 0; //index to write to input array
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                arr[j++] = i;

                countArray[i - min]--;
            }
        }
    }
}
