package recursion;

import java.util.ArrayList;

public class combine {
    int n, k;
    ArrayList<Integer> chosen;
    ArrayList<ArrayList<Integer>> ans;

    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        recur(1);
        return ans;
    }

    public void recur(int i) {
        //剪枝
        if(chosen.size() > k || chosen.size() + (n-i+1) < k)return;
        //递归边界
        if (i == n) {
            //...
            if (chosen.size() == k) {
                ans.add(chosen);
            }
            return;
        }
        //单独分析每个分支
        //每层的相似逻辑：i选或不选
        recur(i + 1);
        chosen.add(i);
        recur(i + 1);
        //还原现场
        chosen.remove(chosen.size()-1);
    }
}
