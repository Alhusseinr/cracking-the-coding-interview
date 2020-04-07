package LeetCode.Month_Daily_Challenge;

public class maxSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 8, 5, 6, 7, 6, -9, -7, -2};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            if(sum < 0){
                sum = nums[i];
            } else {
                sum += nums[i];
            }

            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
