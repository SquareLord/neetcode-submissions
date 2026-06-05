class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int first = 0;
        int second = 0;
        int maxFreq = 0;
        int maxLen = 0;
        while (second < s.length()) {
            count[s.charAt(second) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(second) - 'A']);
            while (second - first + 1 - maxFreq > k) {
                count[s.charAt(first) - 'A']--;
                first++;
            }
            maxLen = Math.max(maxLen, second - first + 1);
            second++;
        }
        return maxLen;
    }
}
