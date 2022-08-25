package week15;

public class TrieArray {

    class Node{
        int count;
        Node[] child;
        Node(){
            count = 0;
            child = new Node[26];
        }
    }

    Node root;

    public TrieArray(){
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
            if(curr.child[ch - 'a'] == null){
                if(isInsert){
                    curr.child[ch - 'a'] = new Node();
                }else{
                    return false;
                }
            }
            curr = curr.child[ch - 'a'];
        }
        if(isInsert) curr.count++;
        if(isPrefix) return true;
        return curr.count > 0;
    }


}
