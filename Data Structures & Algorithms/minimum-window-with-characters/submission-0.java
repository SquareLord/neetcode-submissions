class Solution {
    public String minWindow(String s, String t) {
        int first = 0, second = 0, minIndex = 0, formed = 0;
        int minLength = Integer.MAX_VALUE;
        int[] shortest = new int[128];
        int[] counter = new int[128];
        int maxFormed = 0;
        for (int i = 0; i < t.length(); i++) {
            shortest[t.charAt(i)]++;
            if (shortest[t.charAt(i) ] == 1) maxFormed++;
        }
        while (second < s.length()) {
            counter[s.charAt(second) ]++;
            if (shortest[s.charAt(second) ] == counter[s.charAt(second) ]) formed++;
            if (formed == maxFormed) {
                while (counter[s.charAt(first) ] > shortest[s.charAt(first) ]) {
                    counter[s.charAt(first) ]--;
                    if (shortest[s.charAt(first) ] > counter[s.charAt(first) ]) formed--;
                    first++;
                }
                if (formed == maxFormed && minLength > second - first + 1) {
                    minLength = second - first + 1;
                    minIndex = first;
                }
            }
            second++;
        }
        if (minLength == Integer.MAX_VALUE) return "";
        return s.substring(minIndex, minIndex + minLength);
    }
}
