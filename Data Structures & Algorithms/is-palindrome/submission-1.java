class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        do {
            System.out.println(start + " " + end);
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }
            if (Character.toUpperCase(s.charAt(start)) != 
                    Character.toUpperCase(s.charAt(end))) 
                return false;
            start++;
            end--;
        } while (end - start > 1);
        return true;
    }
}
