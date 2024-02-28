class Solution {
    public String solution(String phone_number) {
        //01011112222
        // 10 -4 = 6
        int totalLength = phone_number.length();
        int startLength = totalLength - 4;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i< startLength; i++) {
            sb.append("*");
        }
        
        String sub = phone_number.substring(startLength,startLength+4);
        sb.append(sub);
        return sb.toString();
        
        
    }
}