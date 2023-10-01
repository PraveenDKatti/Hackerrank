import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i, q, a, b, n;
        Scanner s = new Scanner(System.in);
        q = s.nextInt();
        for(i=0;i<q;i++){
            a = s.nextInt();
            b = s.nextInt();
            n = s.nextInt();
            for(int j=0;j<n;j++){
                int r=0;
                for(int k=0; k<=j;k++){
                    r=r+((int)Math.pow(2,k))*b;
                }
                System.out.print(a+r+" ");
            }
            System.out.println();
        }
    }
}
