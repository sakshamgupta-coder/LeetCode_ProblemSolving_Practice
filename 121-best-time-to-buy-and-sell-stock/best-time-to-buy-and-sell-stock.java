class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][][]=new int[n+1][2][2];
        for(int a[][] : dp)
          for(int b[] : a)
           Arrays.fill(b, -1);
       return solve(0,1,1,prices,dp);
       
    }
    private int solve(int i,int buy,int limit,int []prices,int dp[][][]){
        if(i==prices.length||limit==0)return 0;
        if(dp[i][buy][limit]!=-1)
               return dp[i][buy][limit];

        if(buy==1){
            int buyOp=-prices[i]+solve(i+1,0,limit,prices,dp);
            int skip=solve(i+1,buy,limit,prices,dp);
                    return dp[i][buy][limit]= Math.max(buyOp,skip);
        }
        else{
            int sellOp=prices[i]+solve(i+1,1,limit-1,prices,dp);
            int skip=solve(i+1,0,limit,prices,dp);
            return dp[i][buy][limit]= Math.max(sellOp,skip);
        }
        
    }
}