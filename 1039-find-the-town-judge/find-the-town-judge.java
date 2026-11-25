class Solution {
    public int findJudge(int n, int[][] trust) {
        int inDeg[]=new int[n+1];
        int outDeg[]=new int[n+1];
    
        for(int edge[]:trust ){
            int u=edge[0];
            int v=edge[1];

            outDeg[u]++;
            inDeg[v]++;
        }
        for(int i=1;i<=n;i++){
            if(inDeg[i]==n-1){
                if(outDeg[i]==0)return i;

            }
        }
        return -1;
        
    }
}