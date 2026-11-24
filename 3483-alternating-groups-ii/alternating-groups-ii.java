class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
       int n=colors.length;
       int cnt=0;
       int validSize=1;

       for(int i=1;i<n+k-1;i++){
        if(colors[i%n]!=colors[(i-1)%n]){
            validSize++;
            if(validSize>=k)cnt++;
        }
        else validSize=1;
       }
       return cnt;
    }
}