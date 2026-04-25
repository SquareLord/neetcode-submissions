class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer in = dict.get(target - nums[i]);
            if (in != null) {
                int[] returnVal = new int[2];
                returnVal[1] = i;
                returnVal[0] = in;
                return returnVal;
            }
            dict.put(nums[i], i);
        }
        return null;
        
    }
}
