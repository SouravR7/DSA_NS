import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MissingInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        findMissing(array);
    }
    static void findMissing(int[] array){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int smallest = 0;
        st.push(smallest);
        for(int i=0; i<array.length; i++){
            if(!st.isEmpty() && st.peek() < array[i]){
                if(list.size() == 0){
                    smallest = 0;
                }
                else{
                    smallest++;
                }
                list.add(smallest);
                st.push(array[i]);
            }
            else if(!st.isEmpty() && st.peek() == array[i]){
                list.add(smallest);
                st.push(array[i]);
            }
            else if(!st.isEmpty() && st.peek() > array[i]){
                int small = smallest;
                smallest++;
                if(smallest > array[i]){
                    smallest++;
                }
                if(list.contains(0)){
                    list.add(small);
                }
                else{
                    list.add(smallest);
                }


                st.push(array[i]);
            }
        }
        System.out.println(list);
    }
}
