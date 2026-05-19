// 167. Two Sum II - Input Array Is Sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1, end+1};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         Map<Integer, Integer> obj=new HashMap<>();
//         for(int i=0;i<numbers.length;i++){
//             int complement=target-numbers[i];
//             if(obj.containsKey(complement)){
//                 return new int[]{obj.get(complement)+1,i+1};
//             }
//             else{
//                 obj.put(numbers[i],i);
//             }
//         }
//         return new int[]{-1,-1};
//     }
// }
