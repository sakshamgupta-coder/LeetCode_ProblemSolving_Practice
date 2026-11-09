class Solution {
    public int countVowelRec(int n,int idx){
        if(n==0)return 1;
        int cnt=0;
        for(int i=idx;i<5;i++){
            cnt+=countVowelRec(n-1,i);
        }
        return cnt;
    }
    public int countVowelStrings(int n) {
        return countVowelRec(n,0);
    }
}