class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int dp = nums[0];

        for(int i = 1;i<nums.length;i++){
                if(dp<0){
                    dp = nums[i];
                }else{
                    dp += nums[i];
                }
ans = Math.max(ans,dp);
        }

        return ans;
    }
}
