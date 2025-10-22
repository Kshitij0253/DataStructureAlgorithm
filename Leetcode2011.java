public class Leetcode2011 {
   
     public static int finalValueAfterOperations(String[] operations) {
         int x = 0 ;
        
        for(int i=0;i<operations.length;i++){
            if(operations[i]== "X++" || operations[i]== "++X"){
                x+=1;
            }

             if(operations[i]== "X--" ||operations[i]== "--X"){
                x-=1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println("leetcode 2011");
        String arr[] = {"--X","X++","X++"};
        int ans = finalValueAfterOperations(arr);
        System.out.println(ans);

    }
}
