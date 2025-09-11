import java.util.Arrays;

public class Leetcode2785 {

    public static boolean isVowels(char c){
        c = Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }

     public static String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(isVowels(c)){
                sb.append(c);
            }
        }

        char[] vR = sb.toString().toCharArray();

        Arrays.sort(vR);

        char[]ans = s.toCharArray();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isVowels(s.charAt(i))){
                ans[i]=vR[j];
                j++;
            }
        }
        return new String(ans);
    }
    
    public static void main(String[] args) {
        System.out.println("leetcode 2785 . Sort Vowels in a String");
        String s = "lEetcOde";
        String ans = sortVowels(s);
        System.out.println(ans);
    }
}
