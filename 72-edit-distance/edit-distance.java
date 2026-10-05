class Solution {
    public int minDistance(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return minOperations(n,m,s1,s2,dp);
        
    }
    private int minOperations(int n,int m,String s1,String s2,int dp[][]){
        if(n==0) return m;

       if(m==0)return n;
       if(dp[n][m]!=-1)return dp[n][m];

        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=minOperations(n-1,m-1,s1,s2,dp);
        }else{
            int insert=minOperations(n-1,m,s1,s2,dp);
            int delete=minOperations(n,m-1,s1,s2,dp);
            int replace=minOperations(n-1,m-1,s1,s2,dp);
            return dp[n][m]=1+Math.min(insert,Math.min(replace,delete));
        }
    }
}