import java.util.HashMap;
import java.util.Map.Entry;

public class Leetcode3541 {
    
    public static boolean isVowels(char c ){
        c = Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }

     public static int maxFreqSum(String s) {
        int ans =0;
        int vowCount=0;
        int consCount=0;
        HashMap<Character,Integer> vow = new HashMap<>();
        HashMap<Character,Integer> cons = new HashMap<>();
        for(char c : s.toCharArray()){
            if(isVowels(c)){
                vow.put(c, vow.getOrDefault(c, 0) + 1);
            }else{
                cons.put(c, cons.getOrDefault(c, 0)+1);
            }
        }
for(Entry<Character, Integer> j : vow.entrySet()) {
	      vowCount= Math.max(j.getValue(),vowCount);  	
	        }

            for(Entry<Character, Integer> j : cons.entrySet()) {
	      consCount = Math.max(j.getValue(),consCount);  	
	        }
ans = vowCount+consCount;
        return ans;
    }

    public static void main(String[] args) {
        // a,e,i,o,u
        // s-4
        // u-1
        // c-2
        // e-2

        String s = "successes";
        int ans = maxFreqSum(s);
        System.out.println(ans);
// Output: 6
    }
}
