import java.util.HashSet;
import java.util.Set;

public class Leetcode3 {
    
    public static int LengthOfLongestSubString(String s){
        Set<Character> s1 = new HashSet<>();
        int left=0;
        int ans=0;
        for(int i =0;i<s.length();i++){

            while(s1.contains(s.charAt(i))){
                s1.remove(s.charAt(left));
            left++;
            }
            s1.add(s.charAt(i));
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
    public static void main(String args[]){
        String s = "bbbbb";
        String s2 = "abcabcbb";

        int ans = LengthOfLongestSubString(s2);
        System.out.println(ans);
    }
}
