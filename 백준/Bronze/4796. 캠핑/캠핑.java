import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int i = 1;
        while(true) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            if(l == 0 && p == 0 && v == 0) break;

            int result = (v/p) * l + Math.min(v%p, l);

            sb.append("Case ").append(i).append(": ").append(result).append("\n");
            i++;
        }
        System.out.println(sb);
    }
}