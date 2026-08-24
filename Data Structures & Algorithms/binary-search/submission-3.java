class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        if(nums.length == 0 || nums.length == 1){
            if(nums[0] == target)
            {
                ans = 0;
            }
            return ans;
        }
        int start =0;
        int end = nums.length-1;
        while(end >= start){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                ans = mid;
                return ans;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return ans;
    }
}
