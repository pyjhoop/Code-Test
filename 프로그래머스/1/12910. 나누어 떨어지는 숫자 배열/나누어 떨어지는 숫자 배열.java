import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        arr = Arrays.stream(arr).filter(it-> it % divisor == 0).sorted().toArray();
        
        if(arr.length == 0) return new int[]{-1};
        
        return arr;
        
        
    }
}