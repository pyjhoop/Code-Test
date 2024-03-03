import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i< arr.length; i++) {
            if(stack.isEmpty()) {
                stack.addFirst(arr[i]);
            } else {
                int temp = stack.getFirst();
                if(temp != arr[i]) {
                    stack.addFirst(arr[i]);
                } else {
                    continue;
                }
            }
        }
        
        int size = stack.size();
        int[] answer = new int[size];
        
        for(int i = size-1; i>=0; i--) {
            answer[i] = stack.removeFirst();
        }
    
        return answer;
    }
}