import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int length = A.length();
        // (Defensive programming)
        // just incase the letters are not lowerCase (not nesecary for solution)
        A = A.toLowerCase();
        
        // variable to count how many letters are the same if a palindrome
        // the count should be equal to length/2 for even and length/2 + 1 for odd
        int sameCounter=0;
        if( length % 2 == 0){
            for( int i = 0; i < length/2; i++){
                if(A.charAt(i) == A.charAt(length-i-1)){
                    sameCounter++;
                }
                else{               
                    sameCounter--;
                }
            }
            if(sameCounter == length/2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }            
        }
        else{
             for( int i = 0; i < length/2+1; i++){
                if(A.charAt(i) == A.charAt(length-i-1)){
                    sameCounter++;
                }
                else{
                    sameCounter--;
                }
            }
            if(sameCounter == (length/2 +1)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}



