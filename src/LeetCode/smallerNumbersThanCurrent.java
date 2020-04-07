package LeetCode;
import java.util.*;

public class smallerNumbersThanCurrent {
    public static void main(String[] args){
        int[] nums = new int[]{8,1,2,2,3};
        System.out.println(smallerNumbersThanCurrent(nums));
    }

    // Given the array nums, for each nums[i] find out how many numbers
    // in the array are smaller than it. That is, for each nums[i] you have
    // to count the number of valid j's such that j != i and nums[j] < nums[i].
    // Return the answer in an array.

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newNums = new int[101];

        for(int i = 0; i < nums.length; i++){
            newNums[nums[i]] += 1;
        }

        int count = 0;
        for(int i = 0; i < newNums.length; i++){
            if(newNums[i] != 0){
                int value  = newNums[i];
                newNums[i] = count;
                count = count + value;
            }
        }

        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i]= newNums[nums[i]];
        }
        return result;
    }
}
