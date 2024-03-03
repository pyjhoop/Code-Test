class Solution {
    public int[] solution(String s) {
        int[] arr = new int[2];
        
        while(s.length() != 1) {
            arr[0] = arr[0] +1;
            int total = s.length();
            s = s.replace("0","");
            int size = total - s.length();
            arr[1] = arr[1] + size;
            
            s = Integer.toBinaryString(s.length());
        }
        
        return arr;
        
    }
}