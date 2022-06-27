class Solution {
    private int getMax(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }
    public int lengthOfLongestSubstring(String s) {
        var arrayList = new ArrayList<Character>();
        int maxLength = 0;
        
        for(char c : s.toCharArray()){
            if(arrayList.contains(c)){
                int elemIndex = arrayList.indexOf(c);
                maxLength = getMax(maxLength,arrayList.size());
                arrayList.removeIf((elem) -> arrayList.indexOf(elem) <= elemIndex);
            }else
                maxLength = getMax(maxLength,arrayList.size() + 1);
            
            arrayList.add(c);
        }
        
        return maxLength;
    }
}