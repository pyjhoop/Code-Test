class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double size = arr.length;
        
        double sum = 0.0;
        
        for(int i = 0; i< arr.length; i++) {
            sum+= arr[i];
        }
        
        return sum/ size;
    }
}