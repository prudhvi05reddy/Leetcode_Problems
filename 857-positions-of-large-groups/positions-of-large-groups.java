import java.util.*;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int n = s.length();
        int i = 0;

        while (i < n) {
            int j = i;
            // move j until character changes
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            // check group length
            if (j - i >= 3) {
                result.add(Arrays.asList(i, j - 1));
            }
            i = j; // move to next group
        }
        return result;
    }
}
