package academy.learning.sort.arraylist;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String [] a = {"Narivi", "Jodi", "Justin", "Osiel"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        String x = "aab";
        String y = x.substring(0,3);
        System.out.println(y);
//        Map<String, Integer> roman = new HashMap<>();
//        roman.put("M",1000);
//        roman.put("D",500);
//        roman.put("C",100);
//        roman.put("L",50);
//        roman.put("X",10);
//        roman.put("V",5);
//        roman.put("I",1);

        System.out.println(x.charAt(0));
        Stack<String> s = new Stack<>();

    }

        public static int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;


            while(left <= right){
                int mid =(right+left)/2;
                if(nums[mid] == target){
                    return mid;
                }
                else if(target<nums[mid]){
                    right = mid-1;
                }
                else {
                    left = mid + 1;
                }
            }
            return left;
        }



}
