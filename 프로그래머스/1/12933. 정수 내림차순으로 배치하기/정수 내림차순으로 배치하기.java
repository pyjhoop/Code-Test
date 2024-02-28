import java.util.*;
class Solution {
    public long solution(long n) {
        //문자열을 안쓰면 어떻게 하면 좋을까?
        
        //1. 1부터 9까지 배열을 생성해 개수를 입력한다.
        //2. 뒤에서부터 값을10 -> n2임.
        String str = n+"";
        String[] arr = str.split("");
        
        String str1 = "";
        
        Arrays.sort(arr, Collections.reverseOrder());
        for(String j : arr) {
            str1 += j;
        }
        
        return Long.valueOf(str1);
        
        
    }
}