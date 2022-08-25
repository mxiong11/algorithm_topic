package week1.arrays;

import java.util.ArrayList;
/*
* 合并有序数组
* */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        new MergeSortedArrays().merge(nums1,m,nums2,n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        /*int[] sorted = new int[m + n];
        int cur;*/
        ArrayList arrayList = new ArrayList();
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                arrayList.add(nums2[p2++]);
            } else if (p2 == n) {
                arrayList.add(nums1[p1++]);
            } else if (nums1[p1] < nums2[p2]) {
                arrayList.add(nums1[p1++]);
            } else {
                arrayList.add(nums2[p2++]);
            }
        }
        for (int i = 0; i < arrayList.size(); ++i) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
