package academy.learning.sort.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        //bubble sort
        int[] intArray= {20,35,-15,7,55,1,-22};
        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){
            for(int i=0; i<lastUnsortedIndex;i++){
                if(intArray[i]>intArray[i+1]){
                    swap(intArray,i,i+1);
                }
            }
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
//        for(int j=0;j<intArray.length-1;j++){
//            for(int k=1;k< intArray.length;k++){
//                if(intArray[j]<intArray[k]){
//                    swap(intArray,j,k);
//                }
//            }
//        }
//        int first = intArray[0];
//        int temp;
//        for(int j=0;j<intArray.length;j++){
//            if (intArray[j] > first) {
//                first = intArray[j];
//                temp = intArray[0];
//                intArray[0] = intArray[j]; // 2323, 2323, 102, 7
//                intArray[j] = temp;
//            }
//        }