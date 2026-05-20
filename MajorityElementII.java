// 229. Majority Element II
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1=0, candidate2=0, count1=0, count2=0;
        for(int num : nums){
            if(count1==0 && candidate2 != num){
                candidate1=num;
                count1=1;
            }
            else if(count2==0 && candidate1 != num){
                candidate2=num;
                count2=1;
            }
            else if(candidate1==num){
                count1++;
            }
            else if(candidate2==num){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int threshold=nums.length/3;
        List <Integer> a = new ArrayList<>();
        count1=0; 
        count2=0;
        for(int num: nums){
            if(candidate1==num){
                count1++;
            }
            else if(candidate2==num){
                count2++;
            }
        }
        if(count1>threshold){
            a.add(candidate1);
        }
        if(count2>threshold){
            a.add(candidate2);
        }
        return a;
    }
}

// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> a= new ArrayList<>();
//         Map<Integer, Integer> obj = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             obj.put(nums[i],obj.getOrDefault(nums[i],0)+1);
//         } 
//         int threshold=nums.length/3;
//         for(Map.Entry<Integer, Integer> entry: obj.entrySet()){
//             if(entry.getValue()>threshold){
//                 a.add(entry.getKey());
//             }
//         }
//         return a;
//     }
// }
