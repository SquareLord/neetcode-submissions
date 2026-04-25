class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if (!set.add(nums[i])) return true;
        }
        return false;
    }
}