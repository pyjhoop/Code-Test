class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int min = Integer.parseInt(sArr[0]);
        int max = Integer.parseInt(sArr[0]);
        for(int i = 0; i < sArr.length; i++) {
            int k = Integer.parseInt(sArr[i]);
            
            if(k < min) min = k;
            if(k > max) max = k;
        }
        
        return min+" "+max;
        
    }
}