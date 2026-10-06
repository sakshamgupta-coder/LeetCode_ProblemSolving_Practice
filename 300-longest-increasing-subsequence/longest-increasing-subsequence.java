class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int p=0;p<=i-1;p++){
                if(nums[i]>nums[p]){
                    dp[i]=Math.max(dp[i],1+dp[p]);
                }
            }
        }
        int max=1;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
        }
        return max;

        
    }
}