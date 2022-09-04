package w_2_hashTable_set_map.unorderedMap;

import java.util.HashMap;

public class HashMapCompareTemplates {

    public static boolean equalsMap(HashMap<String, Integer> a, HashMap<String, Integer> b) {

        for (String key : a.keySet()) {
            if(!b.containsKey(key) || b.get(key) != a.get(key) ){
                return false;
            }
        }

        for (String key : b.keySet()) {
            if(!a.containsKey(key) || a.get(key) != b.get(key) ){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("Google",1);
        map1.put("Runoob",2);
        map1.put("Taobao",3);
        map1.put("Zhihu",4);

        map2.put("Google",1);
        map2.put("Runoob",2);
        map2.put("Taobao",3);
        map2.put("Zhihu",4);

        //boolean a = equalsMap(map1,map2);
        System.out.println(equalsMap(map1,map2));
    }
}
