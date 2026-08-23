class Solution {
    public int maxArea(int[] heights) {
        int maxCap = 0;
        int start = 0;
        int end = heights.length - 1;
        while (end>start) {
            int cap = (end - start) * Math.min(heights[end], heights[start]);
            if (cap > maxCap) {
                maxCap = cap;
            }
            if (heights[start] > heights[end]) {
                end--;
            } else
                start++;
        }
        return maxCap;
    }
}
