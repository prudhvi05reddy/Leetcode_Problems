class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int es= n*(n+1)/2;
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        return es-sum;
       
    }
}