import java.util.ArrayList;
import java.util.List;
//leetcode 2562
class LargestConcVal{
    public long findTheArrayConcVal1(int[] num){
        if(num.length<=1){
            return 1;
        }
        long ans =0;
        List<String> s1 = new ArrayList<>();
        int i=0;
        int j=num.length-1;
        while(i<j){
            String str1 = String.valueOf(num[i]);
            String str2 = String.valueOf(num[j]);
            String concat = str1+str2;

            s1.add(concat);
            i++;
            j--;

            if(i==j){
                s1.add(String.valueOf(num[i]));
            }
        }

        for(int k=0;k<s1.size();k++){
            ans+=Integer.parseInt(s1.get(k));
        }

        return ans;
    }


    //2nd way 
    public long findTheArrayConcVal(int[] num){
    int left =0,right = num.length-1;
    long ans =0;

    while(left<=right){
        if(left==right){
            ans=num[left];
        }
        else{
            String concat = Integer.toString(num[left])+ Integer.toString(num[right]);
            ans+= Long.parseLong(concat);
        }
        left++;
        right--;
    }
    return ans;
    }
}