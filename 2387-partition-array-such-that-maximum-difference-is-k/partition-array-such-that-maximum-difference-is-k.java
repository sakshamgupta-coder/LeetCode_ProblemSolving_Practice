class Solution {
    public int partitionArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0],res=1;
    
        for(int i=0;i<n;i++){
           if(nums[i]-min>k){ //when we found any new greater element then break the subsequence and start with next
            res++;
            min=nums[i];
           }
        }
        return res;
        
    }
}