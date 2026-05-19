287. Find the Duplicate Number

// class Solution {
//     public int findDuplicate(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j]==nums[i]){
//                     return nums[j];                
//                 }
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int findDuplicate(int[] nums) {
       int slow=nums[0];
       int fast=nums[0];
       do{
        slow=nums[slow];
        fast=nums[nums[fast]];        
       }while(slow!=fast);
       slow=nums[0];
       while(slow!=fast){
        slow=nums[slow];
        fast=nums[fast];
       }
       return slow;
    }
}
