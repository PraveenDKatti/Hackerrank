import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        int i1 = s.nextInt();
        String s2 = s.next();
        int i2 = s.nextInt();
        String s3 = s.next();
        int i3 = s.nextInt();
        System.out.printf("================================\n");
        System.out.printf("%-15s%0,3d\n",s1,i1);
        System.out.printf("%-15s%0,3d\n",s2,i2);
        System.out.printf("%-15s%0,3d\n",s3,i3);
        System.out.printf("================================");
    }
}
