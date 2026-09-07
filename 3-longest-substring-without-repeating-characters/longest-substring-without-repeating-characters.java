class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, right = 0, maxLen = 0;
        int[] freq = new int[128]; // ASCII character frequency

        while (right < n) {
            char r = s.charAt(right);
            freq[r]++;

            // If duplicate found, shrink window from left
            while (freq[r] > 1) {
                char l = s.charAt(left);
                freq[l]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
