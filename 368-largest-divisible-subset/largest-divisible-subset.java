class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        if (n == 1) {
            ans.add(nums[0]);
            return ans;
        }
        Arrays.sort(nums);
        int dp[] = new int[n + 1];
        int prev[] = new int[n + 1];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int max_len_idx = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[max_len_idx])
                max_len_idx = i;
        }

        while (max_len_idx != -1) {
            ans.add(nums[max_len_idx]);
            max_len_idx = prev[max_len_idx];
        }
        return ans;
    }
}