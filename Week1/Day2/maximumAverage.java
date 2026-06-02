class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = 0;
        
        // Step 1: sum of first k elements
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }
        
        double maxSum = currSum;
        
        // Step 2: slide the window
        for (int i = k; i < nums.length; i++) {
            currSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum / k;
    }
}
