package week15;

import java.util.HashMap;

public class TrieHashMap {

    class Node{
        int count;
        //Node[] child;
        HashMap<Character, Node> child;
        Node(){
            count = 0;
            //child = new Node[26];
            child = new HashMap<Character,Node>();
        }
    }

    Node root;

    public TrieHashMap(){
        root = new Node();
    }

    public void insert(String word){
        find(word, true, false);
    }

    public boolean search(String word){
        return find(word, false, false);
    }

    public boolean startWith(String prefix){
        return find(prefix, false, true);
    }

    private boolean find(String s, boolean isInsert, boolean isPrefix) {
        Node curr = root;
        for(char ch : s.toCharArray()){
            //if(curr.child[ch - 'a'] == null){
            if(!curr.child.containsKey(ch)){
                if(isInsert){
                    //curr.child[ch - 'a'] = new Node();
                    curr.child.put(ch, new Node());
                }else{
                    return false;
                }
            }
            //curr = curr.child[ch - 'a'];
            curr = curr.child.get(ch);
        }
        if(isInsert) curr.count++;
        if(isPrefix) return true;
        return curr.count > 0;
    }


}
