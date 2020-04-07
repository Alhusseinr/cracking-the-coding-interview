package LeetCode;

public class decompressRLElist {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,2,3};
        decompressRLElist(nums);
    }

    public static void decompressRLElist(int[] nums){
        //SplitArray(nums);

        int[] firstHalf = new int[(nums.length + 1)/2];
        int[] secondHalf = new int[nums.length - firstHalf.length];

        for(int i = 0; i < nums.length; i++){
            if(i < firstHalf.length){
                firstHalf[i] = nums[i];
            } else {
                secondHalf[i - firstHalf.length] = nums[i];
            }
        }

        for(int i = 0; i <= 2; i++){
            System.out.print(firstHalf[i]);
            System.out.print(secondHalf[i]);
        }
    }

//    public static Object[] SplitArray(int[] nums){
//
//        return new Object[]{firstHalf, secondHalf};
//    }
}
