class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i] > lis.getLast()) {
                lis.add(nums[i]);

            } else {
                int idx = lowerBound(0, lis.size() - 1, nums[i], lis);
                lis.set(idx, nums[i]);

            }
        }
        return lis.size();
    }

    private int lowerBound(int i,int j,int tar,ArrayList<Integer> arr){
        
        int idx=j+1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr.get(mid)>=tar){
              idx=mid;
              j=mid-1;
            }
           else if( arr.get(mid) <tar){
                i=mid+1;
            }

        }
        return idx;

       }

}