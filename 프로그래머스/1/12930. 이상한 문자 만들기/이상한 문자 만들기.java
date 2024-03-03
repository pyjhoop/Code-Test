class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        for(int i =0; i< s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(" ");
                index = 0;
                continue;
            }
            
            if(index % 2 == 0 ){
                sb.append((s.charAt(i)+"").toUpperCase());
                index++;
            } else {
                sb.append((s.charAt(i)+"").toLowerCase());
                index++;
            }
        }
        return sb.toString();
    }
}