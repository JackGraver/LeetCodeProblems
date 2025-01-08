class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            for(int j = i; j < words.length; j++) {
                if(i==j) {
                    continue;
                }
                if(isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }   
        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2) {
        if(str1.length() > str2.length()) {
            return false;
        }

        int left = 0;
        int str1Right = str1.length() - 1;
        int str2Right = str2.length() - 1;
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(left) == str2.charAt(left)) {
                left++;
            } else {
                return false;
            }
            if(str1.charAt(str1Right) == str2.charAt(str2Right)) {
                str1Right--;
                str2Right--;
            } else {
                return false;
            }
        }
        return true;
    }
}