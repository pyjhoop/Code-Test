class Solution {
    public long solution(int a, int b) {
        long sum = 0L;
        
        int min = (a > b)? b: a;
        int max = (a > b)? a: b;
        
        
        for(int i = min; i<=max; i++) {
            sum += i;
        }
        return sum;
    
    }
}