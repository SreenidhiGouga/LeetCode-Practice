//(Leetcode-3)Longest Substring without repeating characters
class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndexSeen=new int[256];
        int start=0;
        int maxlen=0;
        for(int i=0;i<256;i++){
            lastIndexSeen[i]=-1;
        }
        for(int j=0;j<s.length();j++){
            char a=s.charAt(j);
            
            if(lastIndexSeen[a]>=start){
                start=lastIndexSeen[a]+1;
            }
            lastIndexSeen[a]=j;

            if(j-start+1>maxlen){
                maxlen=j-start+1;
            }
        }
        return maxlen;
    }
}
