class Solution {
    public String solution(String s) {
        // 200번 loop 돌리는게 가장 간단하기 해
        s = s.toLowerCase();
        boolean blank = false;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            
            if(!blank && ch>='a' && ch <= 'z') {
                sb.append((String)(ch+"").toUpperCase());
                blank = true;
            } else {
                sb.append(ch+"");
            }
            if(ch != ' ') {
                blank = true;
            } else {
                blank = false;
            }
            
        }
        return sb.toString();
    }
}