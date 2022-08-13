import java.util.Scanner;

public class examProblem {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int count =0;
            for(int i=0;i<s1.length();i++){
                if( s1.charAt(i) == s2.charAt(i)){
                    count ++;
                }
            }
            if(count ==0){
                System.out.println(s1.length()-n);
            }
            else if(count == s1.length()){
                System.out.println(n);
            }
            else if(count > n && count != s1.length()){
                System.out.println(n + s1.length() - count);
            }
            else if(count < n ){
                System.out.println(count + s1.length() - n);
            }
            else{
                System.out.println(s1.length());
            }


        }
}
