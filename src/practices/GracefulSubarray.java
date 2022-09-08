package practices;

import java.util.HashMap;
import java.util.Map;

public class GracefulSubarray {

    //nums = [1,1,2,1,1], k = 3
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        int odd = 0, ans = 0;
        cnt[0] = 1;
        for (int i = 0; i < n; ++i) {
            odd += nums[i] & 1;
            ans += odd >= k ? cnt[odd - k] : 0;
            cnt[odd] += 1;
        }
        return ans;
    }


    //无累加错误
    public int numberOfSubarrays2(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        int[] s = new int[n + 1];
        s[0] = 0;
        for(int i = 1; i <= n; i++){
            s[i] = s[i-1] + nums[i-1]%2;
        }
        //int[] cnt = new int[n + 1];
        //nums = [1,1,2,1,1], k = 3
        //s = [0,1,2,2,3,4]
        Map<Integer, Integer> hashtable = new HashMap<>();
        hashtable.put(s[0], s[0]);
        for (int i = 1; i <= nums.length; ++i) {
            if (hashtable.containsKey(s[i] -k )) {
                ans++;
            }
            hashtable.put(s[i], hashtable.getOrDefault(s[i],0)+1);
        }
        return ans;
    }

    public int numberOfSubarrays3(int[] nums, int k) {
        int n = nums.length;
        int[] s = new int[n + 1]; // 0~n
        int[] count = new int[n + 1];
        // s[0] = 0;
        count[s[0]]++;
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + nums[i - 1] % 2;
            count[s[i]]++;
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            // s[i] - s[j] = k, 求j的数量
            // s[j] = s[i] - k
            if (s[i] - k >= 0) {
                ans += count[s[i] - k];
            }
        }
        return ans;
    }

    //前缀和，计数模板
    public static void main(String[] args) {
        int []nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(new GracefulSubarray().numberOfSubarrays3(nums,k));
    }


}
