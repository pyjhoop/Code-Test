class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        // 각 자리 구하는거다? 10을 나눈 나머지를 구해봐라
        int i = 0;
        while(n != 0) {
            int rest = (int)(n % 10);
            n /=10;
            answer[i++] = rest;
        }
        
        return answer;
    }
}