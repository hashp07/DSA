import java.util.*;
public class  Spiral_Matrix{
    public static int[] spiralMatrix(int [][]mat) {
        // Write your code here.
        int n = mat.length;
        int m = mat[0].length;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right =m-1;
        ArrayList <Integer> tempans= new ArrayList<>();

        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                tempans.add(mat[top][i]);
            }
            top++;

            for(int i = top; i<=bottom;i++)
            {
                tempans.add(mat[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    tempans.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i =bottom;i>=top;i--)
                {
                    tempans.add(mat[i][left]);
                }
                left ++;
            }
        } 

        int ans[] = new int[tempans.size()];
        for(int i=0;i<tempans.size();i++)
        {
            ans[i] = tempans.get(i);
        }

        return ans;
        
    }
}