import java.util.*;
public class SubArraysSumKOptimize {
	public static void main(String args[]) {
		int a[] = {1,2,4,3,1,2,1,1,3};
		// int a[] = {6,3,5,2};
		// int k = 7;
		int k = 3;
		System.out.println("total number of subarrays of sum k is "+ sumKSubArray(a,k)); // 5 i.e [1,2] [3] [1,2] [2,1] [3]
	}
	
	public static int sumKSubArray(int a[], int k){
		int count = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		
		for(int i = 0; i< a.length; i++) {
			sum+= a[i];
			if(map.containsKey(sum-k))
				count = count + map.get(sum-k);
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return count;
	}
}
 /* if   sum[i]-k = val, where val is an element inside sum[]
  * i.e. sum[i] = k + val,
  * when sum[i] - k = val then we always have a subarray whose sum is k 
  * 
  * TC is O(n)
  */