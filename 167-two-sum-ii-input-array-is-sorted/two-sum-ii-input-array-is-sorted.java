class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=0,n1=numbers.length-1;
        while(n<n1){
            int sum=numbers[n]+numbers[n1];
            if(sum == target){
                return new int[]{n +1,n1+1};
            }
            else if(sum < target){
                n ++;
            }
            else{
                n1--;
            }
        }
        return new int[]{};
    }
}