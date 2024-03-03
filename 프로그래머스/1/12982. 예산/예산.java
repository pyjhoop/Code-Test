import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        // 그리디 문제야
        // 오름차순 정렬 후에 
        Arrays.sort(d);
        int result = 0;
        for(int i = 0; i< d.length; i++) {
            budget -= d[i];
            if(budget>= 0) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}