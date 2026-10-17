class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int sum = 0;
            while (num > 0) {
                int last_digit = num % 10;
                sum += last_digit;
                num /= 10;
            }
            arr[i][0] = nums[i];
            arr[i][1] = sum;
        }
        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        HashMap<Integer, Integer> idx = new HashMap<>();
        for (int i = 0; i < n; i++) {
            idx.put(nums[i], i);
        }
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int correctIdx = idx.get(arr[i][0]);
            if (i != correctIdx) {
                int t = nums[correctIdx];
                nums[correctIdx] = nums[i];
                nums[i] = t;
            
            idx.put(nums[i], i);
            idx.put(nums[correctIdx], correctIdx);
            swaps++;
            }
        }
        return swaps;
    }

}