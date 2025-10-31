import java.util.Arrays;
import java.util.HashSet;

public class Leetcode3397 {
    public static int maxDistinctElemt(int[] arr , int k){
        HashSet<Integer> h1 = new HashSet<>();
        int ans =0;

        for(int i=0;i<arr.length;i++){
            for(int j = -k;j<=k;j++){
                int temp = arr[i]+j;
                if(!h1.contains(temp)){
                    ans++;
                    h1.add(temp);
                    break;
                }
            }
        }

        return ans;
    }


    public static int maxDistinctElements(int[] nums, int k) {
          Arrays.sort(nums);
        int ans = 0;
        long lastUsed = Long.MIN_VALUE;

        for (int num : nums) {
            long start = num - k;
            long end = num + k;

           
            long val = Math.max(start, lastUsed + 1);
            if (val <= end) {
                ans++;
                lastUsed = val;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    
        
        int [] arr = {1,2,2,3,3,4};
        int k = 2;
        int ans = maxDistinctElements(arr, k);
        System.out.println(ans);
    }
}
