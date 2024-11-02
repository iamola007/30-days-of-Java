import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            String s = scanner.nextLine(); // Read the string input
            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();
            
            // Loop through each character in the string
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    evenChars.append(s.charAt(i)); // Append to evenChars if index is even
                } else {
                    oddChars.append(s.charAt(i)); // Append to oddChars if index is odd
                }
            }
            
            // Print the even-indexed characters and odd-indexed characters separated by a space
            System.out.println(evenChars.toString() + " " + oddChars.toString());
        }
        
        // Close the scanner
        scanner.close();
    }
}
