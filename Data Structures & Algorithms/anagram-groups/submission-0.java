class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ra = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] count = new char[26];
            for (int j = 0; j < strs[i].length(); j++) {
                count[strs[i].charAt(j) - 'a']++;
            }
            String key = String.valueOf(count);
            if (!ra.containsKey(key)) {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                ra.put(key, l);
            } else {
                List<String> l = ra.get(key);
                l.add(strs[i]);
            }
        }
        return new ArrayList<>(ra.values());
    }
}