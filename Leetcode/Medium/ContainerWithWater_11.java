class Solution {
 // https://leetcode.com/problems/container-with-most-water/
 // Approach 1: O(n^2)
 // Approach 2: TODO O(n) 
 
    public int maxArea(int[] height) {
        int max = 0;
        for(int i=0; i<height.length; i++){
            for(int j=0; j<height.length; j++){
                int temp = (height[i] < height[j]) ? height[i] * Math.abs(i-j) : height[j] * Math.abs(i-j);
                if(temp > max){
                    max = temp;
                }
            }
        }
        return max;
    }
}
