package w_2_hashTable_set_map.unorderedMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConcatenateWordSubstrings {

    /**
     * 因为单词长度固定的，我们可以计算出截取字符串的单词个数是否和 words 里相等，所以我们可以借用哈希表。
     *
     * 一个是哈希表是 words，一个哈希表是截取的字符串，比较两个哈希是否相等！
     *
     * 因为遍历和比较都是线性的，所以时间复杂度：O(n^2)
     *
     */
    class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> res = new ArrayList<>();
            if (s == null || s.length() == 0 || words == null || words.length == 0) return res;
            HashMap<String, Integer> map = new HashMap<>();
            int one_word = words[0].length();
            int word_num = words.length;
            int all_len = one_word * word_num;
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (int i = 0; i < s.length() - all_len + 1; i++) {
                String tmp = s.substring(i, i + all_len);
                HashMap<String, Integer> tmp_map = new HashMap<>();
                for (int j = 0; j < all_len; j += one_word) {
                    String w = tmp.substring(j, j + one_word);
                    tmp_map.put(w, tmp_map.getOrDefault(w, 0) + 1);
                }
                if (map.equals(tmp_map)) res.add(i);
            }
            return res;
        }
    }


    /**
     * 滑动窗口！
     *
     * 我们一直在 s 维护着所有单词长度总和的一个长度队列！
     *
     * 时间复杂度：O(n)O(n)
     */
    class Solution2 {
        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> res = new ArrayList<>();
            if (s == null || s.length() == 0 || words == null || words.length == 0) return res;
            HashMap<String, Integer> map = new HashMap<>();
            int one_word = words[0].length();
            int word_num = words.length;
            int all_len = one_word * word_num;
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            for (int i = 0; i < s.length() - all_len + 1; i++) {
                String tmp = s.substring(i, i + all_len);
                HashMap<String, Integer> tmp_map = new HashMap<>();
                for (int j = 0; j < all_len; j += one_word) {
                    String w = tmp.substring(j, j + one_word);
                    tmp_map.put(w, tmp_map.getOrDefault(w, 0) + 1);
                }
                if (map.equals(tmp_map)) res.add(i);
            }
            return res;
        }
    }


    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        //String s = "0123";
        //System.out.println(s.substring(0,5));

    }
}
