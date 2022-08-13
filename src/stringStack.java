import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.Stack;

public class stringStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> st = new Stack<>();
        StringBuilder answer = new StringBuilder("");
        int ptr = -1;
        char ch = 'a';

        while(str.length() > 0){
            ptr = checkCharIndex(str,ch);
            if(ptr != -1){
                for(int i=0; i<=ptr; i++){
                    if(!st.empty() && st.peek() <= ch){
                        answer.append(st.pop());
                    }
                    else if(ch == str.charAt(i)){
                        answer.append(str.charAt(i));
                    }
                    else{
                        st.push(str.charAt(i));
                    }
                }
                str = str.substring(ptr+1);
            }
            ch++;
        }
        while(!st.empty()){
            answer.append(st.pop());
        }
        System.out.println(answer);
    }
    static int checkCharIndex(String str, char ch){
        int ptr = -1;
        for(int i=0; i<str.length(); i++){
            if(ch == str.charAt(i)){
                ptr = i;
            }
        }
        return ptr;
    }
}
