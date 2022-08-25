package Graph;
import java.util.BitSet;
public class BitSetTest {
    public static void main(String args[]) {
        int n = 25;
        BitSet bs = new BitSet(n);
        bs.set(0,n,true);
        ShowBits(bs,n);
        bs.flip(0,n);
        ShowBits(bs,n);
        bs.set(17,true);
        ShowBits(bs,n);
    }
    private static void ShowBits(BitSet bs,int n)
    {
        for(int i=0;i<n;++i)
            System.out.print((bs.get(i))?"1":"0");
        System.out.println();
    }
}