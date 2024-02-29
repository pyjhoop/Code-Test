class Solution {
    public String solution(int n) {
        
        int loop = n/2;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< loop; i++) {
            sb.append("수박");
        }
        
        if(n %  2 == 1) sb.append("수");
        return sb.toString();
        
    }
}