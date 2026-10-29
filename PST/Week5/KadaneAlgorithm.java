class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int best=nums[0],sum=0;for(int x:nums){sum=Math.max(x,sum+x);best=Math.max(best,sum);}return best;
    }
}
