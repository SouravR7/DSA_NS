import java.io.*;
import java.util.*;
class makeEqualstring{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int X = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        int cost = 0;
        for(int i=0; i<str1.length(); i++){
            if( str1.charAt(i) != str2.charAt(i)){
                cost += X;
            }
        }
        //System.out.println(cost);
        System.out.println((int)Math.ceil(cost/2.0));
    }
}