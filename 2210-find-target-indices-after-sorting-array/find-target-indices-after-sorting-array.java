class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int cntLess = 0;
        int cntGreater = 0;

        for (int i = 0; i < n; i++) {
            if (target >nums[i])
                cntLess++;
            else if(target<nums[i])
                cntGreater++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = cntLess; i < nums.length - cntGreater; i++) {

            ans.add(i);
        }
        return ans;

    }
}