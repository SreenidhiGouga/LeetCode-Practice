// 169. Majority Element
class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {
//         Map<Integer, Integer> obj=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             obj.put(nums[i], obj.getOrDefault(nums[i],0)+1);
//         }
//         int max=nums.length/2;
//         for(Map.Entry<Integer, Integer> entry: obj.entrySet()){
//             if(entry.getValue()>max){
//                 return entry.getKey();
//             }
//         }
//         return 0;
//     }
// }
