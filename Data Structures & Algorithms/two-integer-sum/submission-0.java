class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int [2];
        for(int i = 0; i<nums.length; i++){
            for(int k = i+1; k<nums.length; k++){
                if(nums[k] == target-nums[i]){
                    ans[0] = i;
                    ans[1] = k;
                    return ans;
                }
            }
        }
        return ans;
    }
}
