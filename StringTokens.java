import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        // check if the no input was scanned or only spaces entered
        if(s == null || s.trim().equals("")){
            System.out.print(0);
            return;
        }
        String[] tokens = s.trim().split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for( String t: tokens){
            System.out.println(t);            
        }
    }
}
