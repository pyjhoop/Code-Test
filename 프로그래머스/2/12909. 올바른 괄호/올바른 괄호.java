import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') stack.addFirst('(');
            else if(ch == ')') {
                if(stack.isEmpty()) return false;
                char temp = stack.getFirst();
                if(temp == '(') stack.removeFirst();
            }
        }
        
        answer = (stack.isEmpty())? true: false;
        

        return answer;
    }
}