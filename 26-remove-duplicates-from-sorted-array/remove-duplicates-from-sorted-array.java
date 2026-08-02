class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0) return 0;
        int n= nums.length;
        int i=1;
        for(int j=1; j<n; j++){
            if(nums[j] != nums[i-1]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}