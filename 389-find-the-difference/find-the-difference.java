class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        for(char a:s.toCharArray()){
            ans^=a;
        }
        for( char a:t.toCharArray()){
            ans ^=a;
        }
        return ans;
        
    }
}