class Solution {
    public int solution(int n) {
        // 내 지식으로 하면 O(n);
        int result = n;
        
        for(int i = 1; i<n; i++) {
            if(n%i == 0) result += i;
        }
        
        return result;
        
        
    }
}