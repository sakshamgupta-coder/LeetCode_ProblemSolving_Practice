class Solution {
    public int countVowelRec(int n,int idx,int dp[][]){
        if(n==0)return 1;
        int cnt=0;
        if(dp[n][idx]!=-1)return dp[n][idx];
        for(int i=idx;i<5;i++){
            cnt+=countVowelRec(n-1,i,dp);
        }
        return dp[n][idx]= cnt;
    }
    public int countVowelStrings(int n) {
        int dp[][]=new int[n+1][5];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return countVowelRec(n,0,dp);
    }
}