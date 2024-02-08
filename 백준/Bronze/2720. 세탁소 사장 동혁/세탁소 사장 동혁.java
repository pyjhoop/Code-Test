import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int[] arr = {25, 10, 5, 1};

        for(int i = 0; i < t; i++) {
            int rest = Integer.parseInt(br.readLine());

            for(int j: arr) {
                int n = rest / j; // 몫
                rest %= j; // 나머지
                sb.append(n).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}