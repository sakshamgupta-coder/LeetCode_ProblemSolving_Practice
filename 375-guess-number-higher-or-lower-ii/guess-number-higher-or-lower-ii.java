class Solution {
    public int getMoneyAmount(int n) {
       
        return solve(n);

    }
    private int solve(int n){
         int dp[][]=new int[n+2][n+1];
         for(int st=n;st>=1;st--){
            for(int end=st;end<=n;end++){
                if(st==end)continue;
                else{
                    int max=Integer.MAX_VALUE;
                    for(int i=st;i<=end;i++){
                        max=Math.min(max,i+Math.max(dp[st][i-1],dp[i+1][end]));
                    }
                    dp[st][end]=max;
                }
            }
         }
       
        return  dp[1][n];
    }
}