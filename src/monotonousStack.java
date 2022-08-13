import java.util.Scanner;
import java.util.Stack;

public class monotonousStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrsize = sc.nextInt();
        int[] array = new int[arrsize];
        for (int i=0;i<arrsize; i++){
            array[i] = sc.nextInt();
        }
        nextGreaterElement(array, arrsize);
    }
    static void nextGreaterElement(int[] array, int arrsize) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < arrsize; i++) {
            if (st.empty() || st.peek() > array[i]) {
                st.push(array[i]);
            } else {
                while (!st.empty() && st.peek() < array[i]) {
                    System.out.print(array[i] + " ");
                    st.pop();
                }
                st.push(array[i]);
            }
        }
            while (!st.empty()) {
                st.pop();
                System.out.print(-1 + " ");
            }
    }
}
