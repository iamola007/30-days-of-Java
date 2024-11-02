import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
         
        List<Integer> binary = new ArrayList<>();
        List<Integer> oneList = new ArrayList<>();
        
        while(n > 0){
            int remainder = n % 2;
            
            n = n/2;
            
            binary.add(0, remainder);
        }
 
       int listSize = binary.size();
       
       int oneCounter = 0;
       for(int i = 0; i < listSize; i++){
           if(binary.get(i) == 1){
               oneCounter++;
           } else {
               oneList.add(oneCounter);
               oneCounter = 0;
           }
       }
       oneList.add(oneCounter);
    
       int max = 0;
       
       int listLenght = oneList.size();
       for(int i = 0; i < listLenght; i++){
           if(max < oneList.get(i)){
               max = oneList.get(i);
           } else {
               max = max;
           }
       }
       System.out.println(max);
    }
}
