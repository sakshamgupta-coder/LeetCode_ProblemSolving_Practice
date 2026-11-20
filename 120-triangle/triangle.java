class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=triangle.get(0).size();
        int dp[][]=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        return solve(0,0,n,m,triangle,dp);
        
    }
    private int solve(int i,int j,int n,int m,List<List<Integer>> arr,int dp[][]){
        if(i==n-1)return  arr.get(n-1).get(j);
        if(dp[i][j]!=Integer.MAX_VALUE)return dp[i][j];

        int down=solve(i+1,j,n,m,arr,dp);

        int dio=solve(i+1,j+1,n,m,arr,dp);
        
         return dp[i][j]= arr.get(i).get(j)+Math.min(dio,down);
    }
}