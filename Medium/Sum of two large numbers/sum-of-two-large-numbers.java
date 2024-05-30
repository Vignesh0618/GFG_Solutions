//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
        // code here
        StringBuilder output=new StringBuilder();
        int lenx=X.length()-1;
        int leny=Y.length()-1;
        int c=0;
        while(lenx>=0 || leny>=0){
            int unitx=0;
            if(lenx>=0){
                unitx=X.charAt(lenx)-'0';
                lenx--;
            }
            int unity=0;
            if(leny>=0){
                unity=Y.charAt(leny)-'0';
                leny--;
            }
            int s=unitx+unity+c;
            c=s/10;
            int d=s%10;
            output.append((char)(d+'0'));
        }
        if(c>0){
             output.append((char)(c+'0'));
            
        }
        int j=output.length()-1;
        while(output.charAt(j)=='0' && j>0){
            output.deleteCharAt(j);
            j--;
        }
        return output.reverse().toString();
    }
}