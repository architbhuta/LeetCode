class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC = 0;
        int currC = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                currC++;
            }
            else{
                maxC= Math.max(maxC, currC);
                currC=0;
            }
        }
        return maxC>currC ? maxC : currC;
    }
}