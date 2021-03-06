public class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0) return -1;
        int start = 0;
        int end  = nums.length-1;
        int mid;
        while(start<=end){
            mid = (start + end) / 2;
            if(nums[mid]==target) return mid;
            if(nums[end]>=nums[mid]){
                if(nums[mid]<target && target<=nums[end]) start = mid + 1;
                else end = mid - 1;
            }
            else {
                if(nums[mid]>target && target>=nums[start]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}