// https://leetcode.com/problems/sort-colors/

class Solution {
    

   public void sortColors(int[] nums) {
    int low= 0;
    int mid = 0;
    int high = nums.length-1;

    while(mid<=high){
      switch(nums[mid]){
        case 0: swap(nums, mid, low);
          mid++;
          low++;
          break;
        case 1: mid++;
          break;
        case 2: swap(nums,high,mid);
          high --;
      }
    }
  }

  void swap(int[] a, int i, int j){
    int temp = a[j];
    a[j] = a[i];
    a[i] = temp;
  }
    
}
