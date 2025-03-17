import java.util.ArrayList;

public class Pascals_Triangle {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				  ArrayList<ArrayList<Long>> ans = new ArrayList<>();
				 for(int i=1;i<=n;i++)
				 {
					ans.add(generateRow(i));
				 }
				 return ans;
	}

	private static ArrayList<Long> generateRow(int row)
	{
		 long ans = 1;;
		ArrayList<Long> anstemp = new ArrayList<>();
		anstemp.add(ans);

		for(int col=1;col<row;col++)
		{
			ans = ans*(row - col)/col;
			anstemp.add(ans);

			
		}
		return anstemp;

	}
}
