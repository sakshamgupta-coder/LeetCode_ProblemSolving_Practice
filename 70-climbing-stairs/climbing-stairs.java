class Solution {
    public int climbStairs(int n) {
        Integer dp[]=new Integer[n];
        return solve(0,n,dp);
    }
    private int solve(int st,int end,Integer dp[]){
        if(st==end)return 1;
        if(st>end)return 0;
        if(dp[st]!=null)return dp[st];
          
         return dp[st]= solve(st+1,end,dp)+solve(st+2,end,dp);
         
    }
}