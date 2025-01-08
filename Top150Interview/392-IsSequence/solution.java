class Solution {
    public boolean isSubsequence(String s, String t) {
        int c = 0;
        int sL = s.length();
        int tL = t.length();
        for(int i = 0; i < tL && c < sL; i++) {
            if(t.charAt(i) == s.charAt(c)) {
                c++;
            }
        }
        return c == sL;
    }
}