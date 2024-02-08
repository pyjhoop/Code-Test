import java.io.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr = {300, 60, 10};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.parseInt(br.readLine());

        solution(time);
        System.out.println(sb);
    }

    static void solution(int time) {
        if(time % arr[2] != 0) {
            sb.append(-1);
            return;
        }

        for(int a: arr){
            int n = time / a;
            time %= a;

            sb.append(n).append(" ");
        }
    }
}