import java.util.ArrayList;
import java.util.List;

public class Rotate_array_by_D{
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        if(arr.size()==0 || k<=0)
        {
            return arr;
        }
        int n=arr.size();   
        k = k%n;
        ArrayList<Integer> rotated = new ArrayList<>();

        for(int i=k;i<n;i++)
        {
            rotated.add(arr.get(i));
        }

        for(int i=0;i<k;i++){
            rotated.add(arr.get(i));
        }

        return rotated;
    }
}