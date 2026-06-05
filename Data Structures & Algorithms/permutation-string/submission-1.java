class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqs1 = new int[26];
        int[] freqs2 = new int[26];
        int first = 0, second = 0;
        for (int i = 0; i < s1.length(); i++) {
            freqs1[s1.charAt(i) - 'a']++;
        }
        while (second < s2.length()) {
            int num = s2.charAt(second) - 'a';
            freqs2[num]++;
            while (freqs1[num] < freqs2[num]) {
                freqs2[s2.charAt(first) - 'a']--;
                first++;
            }
            if (second - first + 1 == s1.length()) return true;
            second++;
        }
        return false;
    }
}
