class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int a:nums){
            if(a>max)max=a;
        }
        int ans=0;
        for(int tra:nums){
            ans+=Math.abs(tra-max);
        }
        return ans;
        
    }
}