package w_2_hashTable_set_map.unorderedMap;

import java.util.*;

public class EctopicLetterGrouping {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<String, List<String>>();
            for (String str : strs) {
                char[] array = str.toCharArray();
                Arrays.sort(array);
                String key = new String(array);
                List<String> list = map.getOrDefault(key, new ArrayList<String>());
                list.add(str);
                map.put(key, list);
            }
            return new ArrayList<List<String>>(map.values());
        }
    }

    //python3
/*    class Solution:
          def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
               mp = collections.defaultdict(list)

               for st in strs:
                   key = "".join(sorted(st))
                   mp[key].append(st)

                return list(mp.values())
*/


}
