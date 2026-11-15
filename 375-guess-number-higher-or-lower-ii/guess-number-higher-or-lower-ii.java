class Solution {
    public int getMoneyAmount(int n) {
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(1,n,dp);

    }
    private int solve(int st,int end,int dp[][]){
        if(st>=end)return 0;
        if(dp[st][end]!=-1)return dp[st][end];
        int max=Integer.MAX_VALUE;

        for(int i=st;i<=end;i++){
            max=Math.min(max,i+Math.max(solve(st,i-1,dp),solve(i+1,end,dp)));
        }
        return  dp[st][end]=max;
    }
}