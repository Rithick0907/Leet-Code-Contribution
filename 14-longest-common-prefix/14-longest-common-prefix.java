class Solution {
    private int findMatchingIndex(String prev,String curr,int end){
        int i = 0;
        for(i = 0; i <= end && i < curr.length(); i++)
            if(prev.charAt(i) != curr.charAt(i))
                break;
        return i - 1;
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1)    return "";
        
        int matchedIndex = strs[0].length() - 1;
        for(int i = 1; i < strs.length; i++){
            matchedIndex = findMatchingIndex(strs[0],strs[i],matchedIndex);
            if(matchedIndex < 0)   break;
        }
        return (matchedIndex >= 0) ? strs[0].substring(0,matchedIndex + 1) : "";
    }
}