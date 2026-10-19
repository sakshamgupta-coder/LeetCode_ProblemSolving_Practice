class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        int cntLess = 0;
        int equal = 0;

        for (int i = 0; i < n; i++) {
            if (target >nums[i])
                cntLess++;
            else if(target==nums[i])
                equal++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < equal; i++) {

            ans.add(cntLess+i);
        }
        return ans;

    }
}