import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // 길이 같아
        // 최대값 * 최소값을 더하는게 제일 최종적으로 최소가 된다.
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - i -1];
        }
        return answer;
    }
}