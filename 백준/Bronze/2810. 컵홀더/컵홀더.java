import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String seats = br.readLine();

        long count = Arrays.stream(seats.split(""))
                .filter(it -> it.equals("L"))
                .count();

        long result = n+1 - (count /2);

        if(result > n) {
            System.out.println(n);
        }else {
            System.out.println(result);
        }
    }
}