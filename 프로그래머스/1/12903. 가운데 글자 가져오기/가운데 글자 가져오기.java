class Solution {
    public String solution(String s) {
        // 홀수일땐 길이 /2 -1번 인덱스가 중간값.
        // 짝수일떈 길이/2 -1 ~ 길이 /2까지 
        int mid = s.length() / 2;
        if(s.length() % 2== 0) {
            s = s.substring(mid-1, mid+1);
        } else {
            s = s.substring(mid, mid+1);
        }
        return s;
    }
}