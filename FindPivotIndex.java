// 724. Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int totsum=0;
        for(int i=0;i<nums.length;i++){
            totsum+=nums[i];
        }
        int rsum=totsum;
        int lsum=0;
        for(int i=0;i<nums.length;i++){
            rsum-=nums[i];
            if(rsum==lsum){
                return i;
            }
            lsum+=nums[i];
        }  
        return -1;      
    }
}

// class Solution {
//     public int pivotIndex(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             int lsum=0;
//             int rsum=0;
//             for(int j=0;j<i;j++){
//                 lsum+=nums[j];
//             }             
//             for(int j=i+1;j<nums.length;j++){
//                 rsum+=nums[j];
//             }
//             if(lsum==rsum){
//                 return i;
//             }
//         } 
//         return -1;
//     }
// }
