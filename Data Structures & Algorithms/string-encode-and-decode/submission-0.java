class Solution {

    public String encode(List<String> strs) {
        String ret = "";
        for (int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            ret += s.length() + "#" + s;
        }
        return ret;
    }

    public List<String> decode(String str) {
        System.out.println(str);
        ArrayList<String> ret = new ArrayList<>();
        int index = 0;
        while (index < str.length()) {
            int strnum = 0;
            while (str.charAt(index) != '#') {
                strnum *= 10;
                strnum += str.charAt(index) - '0';
                index++;
            }
            index++;
            ret.add(str.substring(index, index + strnum));
            index += strnum;
        }
        return ret;
    }
}
