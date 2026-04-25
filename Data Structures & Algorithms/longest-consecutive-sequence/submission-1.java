class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int maxCount = 0;
        int currCount = 1;
        for (int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hash.contains(nums[i] - 1)) continue;
            else {
                int curr = nums[i];
                while (hash.contains(nums[i] + currCount)) {
                    currCount++;
                }
                if (currCount > maxCount) maxCount = currCount;
                currCount = 1;
            }
        }
        return maxCount;
    }
}
