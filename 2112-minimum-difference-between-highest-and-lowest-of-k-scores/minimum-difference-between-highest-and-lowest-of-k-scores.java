class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int d=nums[i+k-1]-nums[i];
            diff=Math.min(diff,d);
        }
        return diff;
    }
}