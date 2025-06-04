class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
         int[] sample=new int[nums.length];
         sample[0]=1;
         for(int i=1;i<nums.length;i++){
            sample[i]=sample[i-1]*nums[i-1];
         }
         int right=1;
         for(int i=nums.length-1;i>=0;i--){
            sample[i]=sample[i]*right;
            right=right*nums[i];
         }
        return sample;
    }
}
