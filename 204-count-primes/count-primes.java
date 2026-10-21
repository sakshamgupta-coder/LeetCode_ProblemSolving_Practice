class Solution {
    public int countPrimes(int n) {
        boolean primeArr[]=new boolean[n];
        Arrays.fill(primeArr,true);
        int count=0;
        for(int i=2;i<n;i++){
            if(primeArr[i]){
                    count++;
                    for(int j=i*2;j<n;j+=i){
                        primeArr[j]=false;
                    }
            }
        }
        return count;
        
    }
}