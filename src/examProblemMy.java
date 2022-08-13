import java.util.Scanner;

public class examProblemMy {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int correct = sc.nextInt();
            String friends_answer = sc.next();
            String my_answer = sc.next();

            int my_right_answer = examTF(correct, friends_answer, my_answer);
            System.out.println(my_right_answer);
        }

        static int examTF(int n , String f_ans, String my_ans){
            int count = 0;
            int my_len = my_ans.length();
            //boolean flag = false;
            for(int i=0; i < my_len; i++){
                if(f_ans.charAt(i) == my_ans.charAt(i)){
                    count++;
                }
            }

            int answer = maxRight(count,n, my_len);

            return answer;
        }

        static int maxRight(int count, int n, int my_len){
            int ans = my_len;
            if(count == 0){
                ans = my_len - n;
            }
            else if(count == my_len ){
                ans = n;
            }
            else if(count > n && count != my_len){
                ans = n + (my_len - count);
            }
            else if(count < n){
                ans = count + my_len - n ;
            }

            return ans;
        }
}
