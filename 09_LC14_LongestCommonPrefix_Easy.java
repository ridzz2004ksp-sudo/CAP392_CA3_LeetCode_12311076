class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String word = strs[i];
                
            while (word.startsWith(prefix) == false) {
                int length = prefix.length();
                prefix = prefix.substring(0, length - 1);

            }
        }
        return prefix;
    }
}
