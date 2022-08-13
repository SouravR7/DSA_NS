import java.io.*;
import java.util.*;
public class distinctCount {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while(T -- > 0){
                int number = sc.nextInt();
                int noOfOperation = sc.nextInt();
                HashSet<Integer> myset = new HashSet<Integer>();
                long count = numberOfDistElement(number, noOfOperation, myset);
                System.out.println(count);
            }
        }
        static long numberOfDistElement(int no, int n, HashSet<Integer> myset) {
            //if (n > 0) {
                long count = 0;
                if (n > 0) {
                    myset.add(no);
                    int num = no;
                    int num1 = no;
                    int op1 = num + 3;
                    myset.add(op1);
                    int op2 = num1 - 3;
                    myset.add(op2);
                    int op3 = no * 2;
                    myset.add(op3);
                    //count += myset.size();
                    numberOfDistElement(op1, n - 1,myset);
                    //count += myset.size();
                    numberOfDistElement(op2, n - 1, myset);
                    //count += myset.size();
                    numberOfDistElement(op3, n - 1, myset);
                    count += myset.size();
                }
                //long count = myset.size();

            //}
            return count;
        }
}
