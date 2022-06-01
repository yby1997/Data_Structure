package academy.learning.sort.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray= {20,35,-15,7,55,1,-22};
        for (int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largestNumberIndex =0;
            for (int i=1;i<=lastUnsortedIndex;i++){
                if(intArray[i]>intArray[largestNumberIndex]){
                    largestNumberIndex=i;
                }
            }
            swap(intArray,largestNumberIndex,lastUnsortedIndex);
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }else{
            int temp=array[i];
            array[i]=array[j];
            array[j] = temp;}
    }

}
