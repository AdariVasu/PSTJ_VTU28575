class MaximumSubarrayCircular {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0,maxEnd=0,maxSum=nums[0],minEnd=0,minSum=nums[0];
        for(int x:nums){maxEnd=Math.max(x,maxEnd+x);maxSum=Math.max(maxSum,maxEnd);minEnd=Math.min(x,minEnd+x);minSum=Math.min(minSum,minEnd);total+=x;}
        return maxSum<0?maxSum:Math.max(maxSum,total-minSum);
    }
}
