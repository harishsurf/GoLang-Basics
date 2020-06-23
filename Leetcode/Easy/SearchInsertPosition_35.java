// https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        return findIndex(nums, low, high, target);
    }


    private int findIndex(int[] nums, int low, int high, int target) {

        while(low <=high){
            int mid = low + (high-low)/2;
            if(target == nums[mid]){
                return mid;
            } else if (target < nums[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return high+1;
    }
}
