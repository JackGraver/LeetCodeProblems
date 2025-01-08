class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        
        Map<Character, Integer> magChars = new HashMap<>();
        for(char c : magazine.toCharArray()) {
            magChars.put(c, magChars.getOrDefault(c, 0) + 1);
        }

        for(char c : ransomNote.toCharArray()) {
            Integer n = magChars.get(c);
            if(n == null) {
                return false;
            } else if (n == 0) {
                return false;
            }
            magChars.put(c, n-1);
        }
        return true;
    }
}