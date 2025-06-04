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

