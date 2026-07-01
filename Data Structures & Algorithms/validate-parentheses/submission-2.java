class Solution {
    public boolean isValid(String s) {
        LinkedList<Integer> link = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(':
                    link.push(1);
                    break;
                case '{':
                    link.push(2);
                    break;
                case '[':
                    link.push(3);
                    break;
                default:
                    int expec = 0;
                    if (s.charAt(i) == ')') expec = 1;
                    if (s.charAt(i) == '}') expec = 2;
                    if (s.charAt(i) == ']') expec = 3;
                    if (link.isEmpty()) return false;
                    Integer n = link.pop();
                    System.out.println(n + " " + expec);
                    if (expec != n) return false;
            }
        }
        if (link.isEmpty()) return true;
        return false;
    }
}
