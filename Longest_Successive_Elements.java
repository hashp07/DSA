import java.util.HashSet;
import java.util.Set;

public class  Longest_Successive_Elements {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int n = a.length;
        // int cnt =0;
        // int x;

        int longest  = 1;
         Set<Integer> set = new HashSet<>();

         for(int i=0;i<n;i++)
         {
             set.add(a[i]);
         }

         for(int it:set)
         {
             if(!set.contains(it-1))
             {
                 int cnt = 1;
                 int x = it;

                 while(set.contains(x+1))
                {
                    cnt = cnt+1;
                    x = x+1;
                }
                 longest = Math.max(longest,cnt);
             }
             
            
         }
         return longest;
    }
}