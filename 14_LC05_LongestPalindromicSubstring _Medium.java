class Solution {

    int start = 0;
    int maxLength = 1;

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);

            expand(s, i, i + 1);
        }
        return s.substring(start, start + maxLength);
    }
    public void expand(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
                start = left;
            }

            left--;
            right++;
        }
    }
}
