package recursion;

import java.util.ArrayList;

public class subset {
    int n;
    ArrayList<Integer> chosen;
    ArrayList<ArrayList<Integer>> ans;

    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> nums){
        n = nums.size();
        recur(nums,0);
        return ans;
    }

    public void recur(ArrayList<Integer> nums, int i) {
        //递归边界
        if (i == n) {
            //...
            ans.add(chosen);
            return;
        }
        //单独分析每个分支
        //每层的相似逻辑：nums[i]选或不选
        recur(nums, i + 1);
        chosen.add(nums.get(i));
        recur(nums, i + 1);
        //还原现场
        chosen.remove(chosen.size()-1);
    }
}
