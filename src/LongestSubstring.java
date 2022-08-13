import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class LongestSubstring{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        int count = longestSubstring(str, size, k);
        System.out.println(count);
    }
    static int longestSubstring(String str, int size, int k){
        int count = 0;
        int stSize = 0;
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<size; i++){

            if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u'){
                //str.charAt(i) = 'e';
                count++;
                if(count == k) {
                    st.push('e');
                    stSize = Math.max(stSize, st.size());
                    while (!st.empty()) {
                        st.pop();
                    }
                    count = 0;
                }
                else {
                    st.push('e');
                }
            }
            else{
                st.push(str.charAt(i));
            }
        }
        return stSize;
    }
}