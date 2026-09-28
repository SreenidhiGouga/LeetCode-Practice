## 125 Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char L=s.charAt(left);
            char R=s.charAt(right);
            if(!Character.isLetterOrDigit(L)) left++;
            else if(!Character.isLetterOrDigit(R)) right--;
            else if(Character.toLowerCase(L)!=Character.toLowerCase(R)) return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
