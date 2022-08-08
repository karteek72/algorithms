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

public class MilitaryTimeFormat {
    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "12:45:54PM";//bufferedReader.readLine();

        String result = Result6.timeConversion(s);

        System.out.println(result);
       // bufferedWriter.write(result);
        //bufferedWriter.newLine();

        //bufferedReader.close();
       // bufferedWriter.close();
    }
}
class Result6 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    //  12:00:00AM
    public static String timeConversion(String s) {
        // Write your code here

        StringBuilder sb = new StringBuilder();

        String[] s1 = s.split(":");
        int firstValue = Integer.parseInt(s1[0]);

        if(s.contains("PM")){
            if(firstValue>0 && firstValue<12){
                sb.append(Integer.parseInt(s1[0])+ 12+":"+s1[1]+":"+ s1[2].replaceAll("PM",""));
            }else if(firstValue == 12){
                sb.append(Integer.parseInt(s1[0])+":"+s1[1]+":"+ s1[2].replaceAll("PM",""));
            }
        }else if(s.contains("AM")){
            if(firstValue==12){
                sb.append("00:"+s1[1]+":"+ s1[2].replaceAll("AM",""));
            }else{
                sb.append(s.replaceAll("AM",""));
            }
        }

        return sb.toString();
    }

}
