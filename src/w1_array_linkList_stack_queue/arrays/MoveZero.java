package w1_array_linkList_stack_queue.arrays;
/*
* 移动零
* */
public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZero().moveZeroes(nums);
    }

    public void moveZeroes(int[] nums){
        int n = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0 ){
                nums [n] = nums[i];
                n++;
            }
        }

        while(n < nums.length){
            nums[n] = 0;
            n++;
        }

        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
