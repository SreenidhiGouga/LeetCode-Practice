//(Leetcode - 268) Find the missing number in the  array
class MissingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int currTot=0;
        for(int i=0;i<n;i++){
            currTot+=nums[i];
        }
        return sum-currTot;
    }
}
