/*Given an array of integers nums and an integer k, 
 * return the total number of continuous subarrays whose sum equals to k.
 */

public class SubArraySumK {
    public static void main(String args[]) {
		int a [] = {1, 2, 4, 3, 1, 2, 1, 1, 3};
		int k = 3;
		System.out.println("total number of subarrays whose sum equal k is "+ sumKOfSubArray(a,k));
	}
	
	public static int sumKOfSubArray(int a[], int k) {
		int n = a.length;
		int count = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = 0;
			for(int j = i; j < n; j++) {
				sum += a[j];
				if(sum == k)
					count++;
			}
		}
		return count;
    }
}

// TC is O(n2)
