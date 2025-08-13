import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Groupanagram{


    // Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 public static List<List<String>> groupAnagrams(String[] strs) {
  

    Map<String,List<String>> ans = new HashMap<>();

    for(String s :strs ){
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);
        String sortedString = new String(c1);

        if(!ans.containsKey(sortedString)){
            ans.put(sortedString, new ArrayList<>());
        }
        ans.get(sortedString).add(s);

    }
    return new ArrayList<>(ans.values());
}
    public static void main(String[] args) {
       
        String[] inputs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> ans = groupAnagrams(inputs);
        System.out.println(ans);
    }
}