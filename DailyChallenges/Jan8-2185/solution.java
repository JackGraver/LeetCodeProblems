class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        int prefLength = pref.length();
        for(String w : words) {
            if(w.length() >= prefLength && w.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}