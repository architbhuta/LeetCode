class Solution {
    public int maximumDifference(int[] nums) {
        int diff= -1;
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j] > nums[i]){
                    diff = Math.max(diff, nums[j] - nums[i]);

            }
        }
        
    }
    return diff;
}
}