//Leetcode-217
//Using sort
class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
                return true;
          }
      }
        return false;
    }
}

//Using HashSet
class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> obj=new HashSet<>();
        for(int num:nums){
            if(obj.contains(num)){
                return true;
            }
            obj.add(num);
        }
        return false;      
    }
}

//Without Built-in functions or collections but time complexity is not optimal
class Solution{
    public boolean containsDuplicate(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == nums[i]){
                    return true;    
                }    
            }  
        }
        return false;
    }
}

