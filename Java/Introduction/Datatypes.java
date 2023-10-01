import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long n=s.nextLong();
                System.out.println(n+" can be fitted in: ");
                if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) {System.out.println("* byte");}
                if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE){System.out.println("* short");}
                if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE){System.out.println("* int");}
                if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE){System.out.println("* long");}
            }
            catch(Exception e)
            {
                System.out.println(s.next()+" can't be fitted anywhere.");
            }

        }
    }
}
