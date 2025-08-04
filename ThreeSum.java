import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    // Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]


//brute force 

public List<List<Integer>> threeSum1(int[] nums){
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
        for(int j=i+1;j<nums.length-1;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[i]+nums[j]+nums[k]==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                }
            }
        }
    }
    return ans;
}




//optimize 
     public List<List<Integer>> threeSum(int[] nums) {
  List<List<Integer>> ans = new ArrayList<>();

  for(int i=0;i<nums.length;i++){
    if(i>0 && nums[i] == nums[i-1]){
        continue;
    }

    int j = i+1, k=nums.length-1;

    while(j<k)
    {
        int sum = nums[i]+nums[j]+nums[k];
        if(sum<0){
            j++;
        }else if(sum>0){
            k--;
        }else{
            ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
            j++;
            k--;

            while(j<k && nums[j]==nums[j+1]){
                j++;
            }
        }
    }

  }
  return ans;
    }
}
