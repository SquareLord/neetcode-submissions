class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int antitarget = -1*nums[i];
            int first = i + 1;
            int second = nums.length - 1;
            int foundLeft = -1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (second - first > 0) {
                if (nums[second] + nums[first] == antitarget) {
                    if (foundLeft >= 0 && nums[first] == nums[foundLeft]) {
                        first++;
                        second--;
                        continue;
                    }
                    ret.add(Arrays.asList(nums[first], nums[second], nums[i]));
                    foundLeft = first;
                    first++;
                    second--;
                } else if (nums[second] + nums[first] > antitarget) {
                    second--;
                } else {
                    first++;
                }
            }
        }
        return ret;
    }
}
