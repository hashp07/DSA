public class alternate_numbers {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n = a.length;
        int pos_index =0;
        int neg_index = 1;
        int[] b = new int[n];
        for(int i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                b[neg_index] = a[i];
                neg_index +=2;
            }
            else
            {
                b[pos_index] = a[i];
                pos_index +=2;
            }
        }
        return b;
    }
}