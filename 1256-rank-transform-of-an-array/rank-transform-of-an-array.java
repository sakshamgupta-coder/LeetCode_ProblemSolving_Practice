class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums);
        Map<Integer, Integer> index = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (i - 1 >= 0 && nums[i - 1] == nums[i]) {
                index.put(nums[i], index.get(nums[i]));
            } else {
                index.put(nums[i], rank);
                rank++;
            }
        }
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = index.get(arr[i]);
        }
        return ans;
    }
}