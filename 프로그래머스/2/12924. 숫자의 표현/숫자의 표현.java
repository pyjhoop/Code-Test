class Solution {
    public int solution(int n) {
        int count = 1;
        int start = 1;
        int end = 2;
        int sum = start+end;
        if(n == 1) return 1;
        
        while(end < n) {
            if(sum < n) {
                sum+= (++end);
            }else if(sum == n) {
                count++;
                sum +=(++end);
            } else {
                sum -= (start++);
            }
        }
        return count;
    }
}