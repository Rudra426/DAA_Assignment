class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = n-1;
        int peak = 0;
        while(left<=right){
            // peak = Math.max(peak,Math.max(nums[left],nums[right]));
            if(nums[peak]<nums[right]){
                peak = right;
            }
            if(nums[left]>nums[peak]){
                peak = left;
            }
            right--;
            left++;
        }
        return peak;
    }
}
