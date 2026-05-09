class Solution {
    public int trap(int[] height) {
        int first = 0;
        int last = height.length - 1;
        while (first < height.length - 1 && height[first + 1] >= height[first]) {
            first++;
        }
        while (last > 1 && height[last - 1] >= height[last]) {
            last--;
        }
        int sum = 0;
        boolean bigger = true;
        Stack<Integer> stack = new Stack<>();
        int moving;
        while (first < last) {
            bigger = height[first] < height[last];
            if (bigger) {
                moving = first + 1;
                while (height[first] > height[moving]) {
                    stack.push(height[moving]);
                    moving++;
                }
                while (!stack.isEmpty()) {
                    sum += height[first] - stack.pop();
                }
                first = moving;
            } else {
                moving = last - 1;
                while (height[last] > height[moving]) {
                    stack.push(height[moving]);
                    moving--;
                }
                while (!stack.isEmpty()) {
                    sum += height[last] - stack.pop();
                }
                last = moving;
            }

        }
        return sum;
    }
}
