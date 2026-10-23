class Solution {
     private int gcd(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b) {
           return  gcd(a % b, b);
        } else {
           return  gcd(a, b % a);
        }
    }
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return gcd(min, max);
    }

   
}