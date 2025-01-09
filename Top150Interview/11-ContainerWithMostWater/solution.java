class Solution {
    public int maxArea(int[] height) {
        int len = height.length-1;
        int currMax = calcArea(0, len, height);
        for(int i = 0, j = len; i < j;) {
            int nextMax = calcArea(i, j, height);
            if(nextMax > currMax) {
               currMax = nextMax;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return currMax;
    }

    private int calcArea(int i, int j, int[] height) {
        return (j - i) * Math.min(height[i], height[j]);
    }
}