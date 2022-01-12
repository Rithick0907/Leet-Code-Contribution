class Solution {
    private boolean isOpeningParenthesis(char c){
        return c == '(' || c == '{' || c == '[';
    }
    private char findMatchingParenthesis(char c){
        switch(c){
            case ')' : return '(';
            case ']' : return '[';
            default : return '{';
        }
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            boolean isOpen = isOpeningParenthesis(c);
            if(isOpen)
                stack.push(c);
            else{
                if(stack.isEmpty() || stack.pop() != findMatchingParenthesis(c))
                    return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}