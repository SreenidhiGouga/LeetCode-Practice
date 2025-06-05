//(Leetcode-57) Return the sum of the sub-array with largest sum
class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int currMax=nums[0];
        int maxSoFar=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(currMax+nums[i]>nums[i]){
                currMax=currMax+nums[i];
            }
            else{
                currMax=nums[i];
            }
            if(currMax>maxSoFar){
                maxSoFar=currMax;
            }
        }
        return maxSoFar;        
    }
}
