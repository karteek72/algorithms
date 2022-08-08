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

import static java.util.stream.Collectors.*;


class Result4 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long[] ints = arr.stream().mapToLong(Integer::longValue).sorted().toArray();

        long minSum = 0;
        long maxSum = 0;
        for(int i=0;i<ints.length-1;i++){
            minSum = minSum + ints[i];
        }
        for(int i=1;i<ints.length;i++){
            maxSum = maxSum + ints[i];
        }
        System.out.println(minSum + " " + maxSum);

    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result4.miniMaxSum(arr);

        bufferedReader.close();
    }
}
