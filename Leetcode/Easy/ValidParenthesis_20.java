import java.util.Stack;

public class ValidParenthesis_20 {
//    https://leetcode.com/problems/valid-parentheses/

    // Approach 1 - Using stack
    public boolean isValid(String s) {
        int i=0;
        Stack<Character> stk = new Stack();
        while (i <s.length()){
            char ch = s.charAt(i++);
            if(ch == '{') {
                stk.push('}');
            } else if(ch == '(') {
                stk.push(')');
            } else if(ch == '[') {
                stk.push(']');
            } else if (stk.isEmpty() || ch != stk.pop()) {
                return false;
            }
        }
        return stk.isEmpty();
    }

    // Approach 2 - Could also use map(k,v) = (`{`, `}`) instead of if-else. But still need a stack
}
