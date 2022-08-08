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

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here

        boolean upHill = false;
        boolean downHill = false;
        int seaLevel = 0;
        int valley = 0;
        char[] pathArr = path.toCharArray();
        for(int i=0; i<steps ;i++){
            if(pathArr[i]=='U'){
                seaLevel++;
            }else if(pathArr[i] == 'D'){
                seaLevel --;
            }

            if(seaLevel < 0){
                downHill = true;
                upHill = false;
            }else if(seaLevel>0){
                upHill = true;
                downHill = false;
            }

            if(upHill && seaLevel ==0){
                downHill = false;
            }else if(downHill && seaLevel ==0) {
                upHill =false;
            }

            if(i>0 && downHill & !upHill && seaLevel==0){
                valley ++;
            }
        }
        return valley;
    }
}

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
