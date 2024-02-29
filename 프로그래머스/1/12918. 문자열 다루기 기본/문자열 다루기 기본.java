class Solution {
    public boolean solution(String s) {
        // 길이 조건문 추가
        // 반복문의로 숫자외의 것 있음 리턴
        boolean flag = true;
        if(s.length() == 4 || s.length() == 6) {
            System.out.println("asasdf");
            
            for(int i = 0; i<s.length(); i++) {
                char ch = s.charAt(i);
                System.out.println(ch);
                if(ch<'0' || ch >'9') {
                    System.out.println("asasdf");
                    System.out.println(ch);
                    flag = false;
                }
            }
            
            
        }else {
            System.out.println("d");
            flag = false;
        }
        
        return flag;
    }
}