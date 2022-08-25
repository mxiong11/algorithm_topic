package week1.arrays;

/*
* 在有序数组中删除重复项
* */
public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        System.out.println(new RemoveDuplicatesInSortedArray().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] !=nums[i-1]) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}
