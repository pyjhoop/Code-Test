class Solution {
    boolean solution(String s) {
        //p y의 개수 일치하면 true
        //둘다 하나도 없으면 true
        // 50자 이하.

        int pCount = 0;
        int yCount = 0;
        s = s.toLowerCase();
        for(int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == 'p') pCount++;
            else if(s.charAt(i) == 'y') yCount++;
        }
        
        if(pCount == 0 && yCount == 0) return true;
        
        return pCount == yCount;
    }
}