class Solution {
  public int search(int[] nums, int target) {
    int lo = 0;
    int hi = nums.length - 1;
    while(lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if(target < nums[mid]) {
        hi = mid - 1;
      } else if(nums[mid] < target) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    
    return -1;
  }
}