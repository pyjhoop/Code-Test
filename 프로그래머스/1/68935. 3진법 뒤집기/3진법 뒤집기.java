class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n > 0){
            int temp = n % 3;
            sb.insert(0, temp);
            n /= 3;
        }
        sb.reverse();
        return Integer.parseInt(sb.toString(), 3);
    }
}