class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int res=0;
    
        for(int i=0;i<n;i++){
            Set<Integer> ans=new HashSet<>();
            for(int j=i;j<n;j++){
                  ans.add(nums.get(j));
                  res+=ans.size()*ans.size();
            }
           
        }
        return res;
    }
}