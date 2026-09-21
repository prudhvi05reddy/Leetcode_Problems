class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;   
        int ans = 10;           
        int uniqueDigits = 9;   
        int availableDigits = 9; 

        for (int i = 2; i <= n; i++) {
            uniqueDigits *= availableDigits; 
            ans += uniqueDigits;             
            availableDigits--;              
        }
        return ans;
    }
}
