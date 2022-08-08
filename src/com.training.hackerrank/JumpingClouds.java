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

class Result1 {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    static int jumpingOnClouds(int[] c) {
        int i;
        int jump=0;

        for (i=0;i<c.length-1;i++)
        {
            jump++;
            if(i<c.length-2 && c[i+2]==0)
                i++;
        }
        return jump;

    }

}
public class JumpingClouds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        bufferedReader.close();

        int result = Result1.jumpingOnClouds(c.stream().mapToInt(Integer::intValue).toArray());
        System.out.println(String.valueOf(result));

    }
}
