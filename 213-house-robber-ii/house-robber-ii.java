class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
       if(n==2)return Math.max(nums[0],nums[1]);
        int dp1[]=new int[n];
        Arrays.fill(dp1,-1);
        int dp2[]=new int[nums.length];
          Arrays.fill(dp2,-1);
        return Math.max(maxProfit(0,nums, n-2,dp1),maxProfit(1,nums,n-1,dp2));
    }
    private int maxProfit(int idx,int nums[],int n,int dp[]){
        if(idx>n)return 0;
        if(idx==n)return nums[n];
        if(dp[idx]!=-1)return dp[idx];
           int take=nums[idx]+maxProfit(idx+2,nums,n,dp);
           int not=maxProfit(idx+1,nums,n,dp);
           return dp[idx]= Math.max(take,not);
    }
}
