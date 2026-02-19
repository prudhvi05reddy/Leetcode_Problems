class Solution {
    public int countBinarySubstrings(String s) {
        int p=0,c=1,r=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                r+=Math.min(p,c);
                p=c;
                c=1;
            }
        }
        r+=Math.min(p,c);
        return r;
    }
}