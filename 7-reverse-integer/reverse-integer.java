class Solution {
    
    public int reverse(int x) {
       int num=Math.abs(x);
       int res=0;
       while(num!=0){
        int lastDig=num%10;
        if(res>Integer.MAX_VALUE/10||res<Integer.MIN_VALUE/10)return 0;
        res=res*10+lastDig;
        num/=10;
       }
       return (x<0)?(-res):res;
        
        
        
    }

}