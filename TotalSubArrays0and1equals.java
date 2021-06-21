import java.util.*;
    public class TotalSubArrays0and1equals {
        public static void main(String args[]) {
            int a[] = {1,0,0,1,0,1,1};
            int n = a.length;
            System.out.println("total no. of subarrays having equal no. of 1s and 0s is "+ totalSubArray(a,n));
        }
        
        public static int totalSubArray(int a[], int n) {  
            int count = 0;
            int sum = 0;
            HashMap<Integer, Integer> hm = new HashMap<>();
            hm.put(0,1);
            for(int i = 0; i<n; i++){
                if(a[i] == 1)
                sum++;
                else sum--;

                if(hm.containsKey(sum)){
                    count += hm.get(sum);
                }
                hm.put(sum, hm.getOrDefault(sum, 0) + 1);
            }
            return count;
        }
}
