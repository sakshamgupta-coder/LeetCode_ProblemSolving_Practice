class Solution {
    public int maxSubArray(int[] nums) {
        
       int max = Integer.MIN_VALUE;
       int dp[]=new int[nums.length];
       Arrays.fill(dp,Integer.MIN_VALUE);
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, maxSum(i, nums.length - 1, nums,dp));
        }
        return max;
    }
    private int maxSum(int i,int n,int arr[],int dp[]){
        if(i==n)return arr[n];
        if(dp[i]!=Integer.MIN_VALUE)return dp[i];
           dp[i]=Math.max(arr[i]+maxSum(i+1,n,arr,dp),arr[i]);
            return dp[i];

    }
}