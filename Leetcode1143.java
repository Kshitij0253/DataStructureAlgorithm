class Leetcode1143{

      public static int longestCommonSubsequence(String text1, String text2) {
     int n = text1.length();
     int m = text2.length();
     int[][]arr = new int[n+1][m+1];

     for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(i==0||j==0){
                continue;
            }
            else if(text1.charAt(i-1) == text2.charAt(j-1)){
            arr[i][j]=1+arr[i-1][j-1];
            }else{
                arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
     }
     return arr[n][m];
    }
    public static void main(String[] args) {
        System.out.println("leetcode 1143  Longest Common Subsequence");
        String text1 = "abcde";
        String text2 = "ace" ;
        int ans = longestCommonSubsequence(text1, text2);
        System.out.println(ans);
    }
}