package src.com.training.hackerrank;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here

        StringBuilder sb = new StringBuilder();

        for(int i=(n-1);i>=0;i--){
            for(int j=0; j<i;j++){
                sb.append(" ");
            }
            for(int j=i;j<n;j++){
                sb.append("#");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());

    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());
        int n = 6;

        Result3.staircase(n);

        bufferedReader.close();
    }
}
