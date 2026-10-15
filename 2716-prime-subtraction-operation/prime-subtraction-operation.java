class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        boolean primeArr[] = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            primeArr[i] = true;
        }
        for (int i = 2; i * i <= 1000; i++) {
            if (primeArr[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    primeArr[j] = false;
                }
            }
        }
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int diff = nums[i] - prev;
            for (int p = diff - 1; p >= 2; p--) {
                if (primeArr[p]) {
                    nums[i] -= p;
                    break;
                }
            }

            if (nums[i] <= prev) {
                return false;
            }
            prev = nums[i];
        }
        return true;

    }
}