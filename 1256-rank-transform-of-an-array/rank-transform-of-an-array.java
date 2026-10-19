class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int nums[] =arr.clone(); 
        Arrays.sort(nums);
        Map<Integer, Integer> index = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < n; i++) {
            if (!index.containsKey(nums[i])){
                index.put(nums[i],rank++);
            }
        }
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = index.get(arr[i]);
        }
        return ans;
    }
}