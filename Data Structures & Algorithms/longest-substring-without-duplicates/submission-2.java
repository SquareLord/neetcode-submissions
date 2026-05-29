class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        if (s.length() < 2) return s.length();
        int maxLength = 0; 
        int first = 0;
        int second = 0;
        hs.add(s.charAt(0));
        while (second < s.length() - 1) {
            if (hs.contains(s.charAt(second + 1))) {
                hs.remove(s.charAt(first));
                first++;
            } else {
                second++;
                maxLength = Math.max(maxLength, second - first + 1);   
                hs.add(s.charAt(second));
            }
            System.out.println(maxLength);
        }
        return maxLength;
    }
}
