package LeetCode;

public class numberOfSteps {
    public static void main(String[] args){
        int nums = 2000000000;

        System.out.println(numberOfSteps(nums));
    }

    public static int numberOfSteps(int nums){
        int counter = 0;

        if(nums == 0) { return counter; };

        while(nums != 0){
            if(nums % 2 == 0){
                nums = nums / 2;
            } else {
                nums = nums - 1;
            }
            counter++;
        }
        return counter;
    }
}
