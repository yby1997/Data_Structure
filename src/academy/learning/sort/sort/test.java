package academy.learning.sort.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
//        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        test t = new test();
//        t.reverseString(s);
//
//        Map <Integer,Integer> hm = new HashMap<>();
//        int[]arr={2,7,7,15};
//        for(int i=0;i<arr.length;i++){
//            hm.put(arr[i],i);
//        }
//
//
//        System.out.println(Arrays.toString(twoSum(arr,14)));
        System.out.println(isPowerOfTwo(536870912));

    }

    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n <=0){
            return false;
        }
        if(n%2 == 0){
            return isPowerOfTwo(n/2);
        }else{
            return false;
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    public void swap(char[] s, int a, int b) {


            char temp = s[a];
            s[a] = s[b];
            s[b]=temp;


    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            swap(s, i, s.length-1-i);
            System.out.println(s[i]);
        }

        // for(int i=0;i<s.length;i++){
        //     s[s.length-(ArrayUtils.indexOf(s,s[i])+1)] = s[i];
        // }
        System.out.println(s);
    }
}
