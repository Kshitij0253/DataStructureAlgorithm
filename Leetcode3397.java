import java.util.HashSet;

public class Leetcode3397 {
    public static int maxDistinctElemt(int[] arr , int k){
        HashSet<Integer> h1 = new HashSet<>();
        int ans =0;

        for(int i=0;i<arr.length;i++){
            for(int j = -k;j<=k;j++){
                int temp = arr[i]- j;
                if(!h1.contains(temp)){
                    ans++;
                    h1.add(temp);
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
    
        
        int [] arr = {4,4,4,4};
        int k = 1;
        int ans = maxDistinctElemt(arr, k);
        System.out.println(ans);
    }
}
