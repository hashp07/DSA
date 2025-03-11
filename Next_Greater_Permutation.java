import java.util.*;
public class Next_Greater_Permutation {
    public static List< Integer > nextGreaterPermutation(List< Integer > a) {
        // Write your code here.
        int n = a.size();
        int idx = -1;

        for(int i = n-2;i>=0;i--)
        {
            if(a.get(i)<a.get(i+1))
            {
                idx = i;
                break;
            }
        }

        if(idx == -1)
        {
             Collections.reverse(a);
             return a;
        }

        for(int i = n-1;i>idx;i--)
        {
            if(a.get(i) > a.get(idx))
            {
                int temp = a.get(i);
                a.set(i,a.get(idx));
                a.set(idx,temp);
                break;
            }
        }
        List <Integer> sublist = a.subList(idx+1,n);
       //List<Integer> sublist = a.subList(idx + 1, n);
        Collections.reverse(sublist);

        return a;
    }
}