
public class maxumum_subarray_sum {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxi = Long.MIN_VALUE; 
		long sum = 0;
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
			if(sum > maxi)
			{
				maxi = sum;
			}
			if(sum < 0)
			{
				sum = 0;
			}
		}
		return maxi < 0 ? 0 : maxi;
	}


}
