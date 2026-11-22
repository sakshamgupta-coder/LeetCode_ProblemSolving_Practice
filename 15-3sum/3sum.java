class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int l=i+1,r=n-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);list.add(nums[l]);list.add(nums[r]);
                    ans.add(list);
                   while(l<r&&nums[l]==nums[l+1])l++;
                   while(l<r&&nums[r]==nums[r-1])r--;

                   l++;
                   r--;

                }
                else if(nums[i]+nums[l]+nums[r]<0){l++;}
                else r--;
            }
        }
        return ans;
    }
}