class Solution {
    public int solution(int num) {
        if(num == 1) return 0;
        
        long init = (long) num;
        int count = 0;
        while(init != 1) {
            
            if(count == 500) return -1;
            
            init = (init % 2 ==0)? init/2 : init *3+1;
            count++;
            
        }
        return count;
        
    }
}