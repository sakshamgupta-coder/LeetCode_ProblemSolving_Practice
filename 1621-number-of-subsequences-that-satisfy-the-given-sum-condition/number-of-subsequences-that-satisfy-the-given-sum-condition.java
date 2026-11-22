class Solution {
    public int numSubseq(int[] arr, int target) {
        Arrays.sort(arr);
        int MOD=1000000007;
        int n=arr.length;
        int pow[]=new int[n];
         pow[0]=1;
         for(int i=1;i<n;i++){
            pow[i]=(pow[i-1]*2)%MOD;
         }
        int i=0,j=n-1;
        int cnt=0;
        while(i<=j){
            if((arr[i]+arr[j])<=target){
                cnt=(cnt+pow[j-i])%MOD;
                i++;
            }
            else j--;
        }
        return cnt;
    }
}