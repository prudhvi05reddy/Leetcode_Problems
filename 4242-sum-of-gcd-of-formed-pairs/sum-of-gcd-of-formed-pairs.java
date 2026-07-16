import java.util.*;

class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        
        int currentMax = nums[0];
        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, nums[i]);
            prefixGcd[i] = gcd(nums[i], currentMax);
        }
        
        Arrays.sort(prefixGcd);
        
        long sum = 0;
        int left = 0, right = n - 1;
        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }
        
        return sum;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
