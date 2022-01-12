class Solution {
    private int getNumericRepresentation(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) {
        int len = s.length();
        if(len == 0) return 0;
        else if(len == 1)     return getNumericRepresentation(s.charAt(0));
        
        int num = 0;
        int prev = 0;
        for(int curr = 1; curr < len; curr++){
            boolean temp = getNumericRepresentation(s.charAt(prev)) >= getNumericRepresentation(s.charAt(curr));
            if(temp)
                num += getNumericRepresentation(s.charAt(prev));
            else{
                num += getNumericRepresentation(s.charAt(curr)) - getNumericRepresentation(s.charAt(prev));
                ++curr;
                ++prev;
            }
            ++prev;
        }
        return (prev == len - 1)? num + getNumericRepresentation(s.charAt(prev)) : num;
    }
}