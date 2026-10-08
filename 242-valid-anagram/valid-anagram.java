class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] p = s.toCharArray();
        char[] q = t.toCharArray();
        Arrays.sort(p);
        Arrays.sort(q);

       
         return Arrays.equals(p, q);

        }
    }