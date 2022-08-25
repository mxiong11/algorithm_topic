package recursion;

import java.util.ArrayList;

public class permute {
    int n;
    ArrayList<Boolean> used ;
    ArrayList<Integer> a;
    ArrayList<ArrayList<Integer>> ans;

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> nums){
        n = nums.size();
        used = new ArrayList<Boolean>(n);
        for(int i = 0; i <= n; i++){
            used.set(i,false);
        }
        recur(nums,0);
        return ans;

    }

    private void recur(ArrayList<Integer> nums, int pos) {
        if(pos == n){
            ans.add(a);
            return;
        }

        for(int i = 1; i < n; i++ ){
            if(!used.get(i)){
                a.add(nums.get(i));
                used.set(i, true);
                recur(nums, pos + 1);
                used.set(i, false);
                a.remove(nums.get(i));
            }
        }

    }
}
