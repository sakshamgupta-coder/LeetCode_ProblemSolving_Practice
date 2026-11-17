class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
       if(n==2)return Math.max(nums[0],nums[1]);
        int dp1[]=new int[n+1];
        Arrays.fill(dp1,-1);
        int dp2[]=new int[n+1];
          Arrays.fill(dp2,-1);
        return Math.max(maxProfit(0,nums, n-2,dp1),maxProfit(1,nums,n-1,dp2));
    }
    private int maxProfit(int idx,int nums[],int n,int dp[]){
        dp[n]=nums[n];
        dp[n-1]=Math.max(nums[n],nums[n-1]);

        for(int i=n-2;i>=idx;i--){
            dp[i]=Math.max(nums[i]+dp[i+2],dp[i+1]);
        }
        return dp[idx];
    }
}
