package src.com.training.hackerrank;


import java.io.*;

public class StringReverse {



    public static void main(String[] args) throws IOException {

        String origString = "abcde";

        StringReverse objRev = new StringReverse();
        objRev.reverseString(origString);
    }

    private void reverseString(String ste){
        if(ste!=null && ste.length()>0){

            char[] chars = ste.toCharArray();

            for(int i=chars.length-1;i>=0; i--){
                System.out.print(chars[i]);
            }
        }
    }
}
