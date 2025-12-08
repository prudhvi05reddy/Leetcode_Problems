class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // make it 0-based
            int rem = columnNumber % 26;
            char c = (char)('A' + rem);
            sb.append(c);       // build in reverse
            columnNumber /= 26; // move to next "digit"
        }
        
        return sb.reverse().toString(); // correct order
    }
}
