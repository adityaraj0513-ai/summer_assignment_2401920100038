class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = Double.MIN_VALUE;
        double currSum = 0;
        int i ;
        for (i = 0; i < k; i++) {
            currSum = currSum + nums[i];
        }
        int j = i + k - 1;
        for (i = 1; j < nums.length; i++) {
            maxSum = Math.max(currSum, maxSum);
            currSum = currSum + nums[j] - nums[i - 1];
        }

        return maxSum/k ;
    }
}