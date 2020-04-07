package LeetCode.Month_Daily_Challenge;

public class singleNumber{
    public static void main(String[] args){
        int nums[] = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("Element occurring once is " +
                singleNumber(nums) + " ");
    }
    public static int singleNumber(int[] nums){
        if(nums == null) return 0;
        int result = nums[0];

        for(int i = 1; i < nums.length; i++){
            result = result ^ nums[i];
        }

        return result;
    }
}