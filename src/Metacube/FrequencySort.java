package Metacube;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class FrequencySort {

    public static int[] frequenctSort(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        // map filling
        for(int num : nums){
            map.put(num, map.getOrDefault(num , 0) + 1 );
        }

        Integer temp[] = new Integer[nums.length];

        for(int i =0; i<nums.length; i++){
            temp[i] = nums[i];
        }

        // sorting the array on the basic of frequency in Increasing order
//        Arrays.sort(temp, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                if(map.get(a) == map.get(b)) return b-a; // for same frequency element decreasing
//                return map.get(a) - map.get(b);
//            }
//        });

        // sorting the array on the basic of frequency in decreasing order
        Arrays.sort(temp, new Comparator<Integer>() {
            //            @Override
            public int compare(Integer a, Integer b) {
                if(map.get(a) == map.get(b)) return a - b; // for same frequency element increasing
                return map.get(b) - map.get(a);
            }
        });
        for(int i =0; i<nums.length; i++){
            nums[i] = temp[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,5,4};
        frequenctSort(nums);

        // array print
        for(int i : nums){
            System.out.print(i + " ");
        }
    }
}
