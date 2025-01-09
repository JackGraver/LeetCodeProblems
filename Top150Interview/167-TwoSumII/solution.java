class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        for(int i = 0, j = len-1; i < j;) {
            int res = numbers[i] + numbers[j];
            if(res == target) {
                return new int[] {i + 1, j + 1};
            } else if(res < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}