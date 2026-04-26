class Solution {
    public int maxArea(int[] heights) {
        int first = 0;
        int last = heights.length - 1;
        int maxHeight = Math.min(heights[first], heights[last]) * (last - first);
        while (last - first > 0) {
            boolean shortest = (heights[first] > heights[last]);
            if (!shortest) { //&& heights[first] < heights[first + 1]) {
                first++;
            } else if (shortest) {// && heights[last] < heights[last - 1]) {
                last--;
            }
            int height = Math.min(heights[first], heights[last]) * (last - first);
            maxHeight = Math.max(height, maxHeight);
        }
        return maxHeight;
    }
}
