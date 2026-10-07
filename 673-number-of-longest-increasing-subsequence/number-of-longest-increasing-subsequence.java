class Solution {
    public int findNumberOfLIS(int[] arr) {
        int n=arr.length;
        int dp[]=new int[n+1];   
        int count[]=new int[n];
         Arrays.fill(dp,1);
         Arrays.fill(count,1);
         for(int i=0;i<n;i++){
            for(int p=0;p<=i-1;p++){
                if(arr[i]>arr[p]&&dp[i]<dp[p]+1){ 
                    count[i]=count[p]; 
                    dp[i]=1+dp[p];
                }else if(dp[i]==dp[p]+1&&arr[i]>=arr[p]){
                     count[i]+=count[p];
                }
            }
         }
            int max=1;
            for(int i=0;i<n;i++){
            if(dp[i]>max){
                max=dp[i];
            }
            }
            int counts=0;
            for(int i=0;i<n;i++){
                if(dp[i]==max)
                counts+=count[i];

            }
         return counts;

   

        
    }
}