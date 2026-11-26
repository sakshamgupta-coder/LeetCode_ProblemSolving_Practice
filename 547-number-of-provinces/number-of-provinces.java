class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean vis[]=new boolean[isConnected.length];
          Queue<Integer> q=new LinkedList<>();
         
          int province=0;
          for(int i=0;i<isConnected.length;i++){
              if(!vis[i]){
                  province++;
                  q.add(i);
                    vis[i]=true;
                    while(!q.isEmpty()){
                     int u=q.poll();
                      for (int v = 0; v < isConnected.length; v++) {
                           if (isConnected[u][v] == 1 && !vis[v]) {
                              vis[v] = true;
                               q.add(v);
                            }
                        }
                    }
                }
            }
          return province;
        
    }
}