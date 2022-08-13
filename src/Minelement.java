import java.util.Scanner;
public class Minelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int start = 0;
            int end = n - 1;
            int result = arr[n - 1];
            while (start <= end) {
                int mid = (start + end) / 2;
                int next = (mid + 1) % n;
                int prev = (mid + n - 1) % n;
                if (arr[mid] < arr[next] && arr[mid] < arr[prev]) {
                    result = arr[mid];
                    break;
                } else if (arr[start] <= arr[mid]) {
                    start = mid + 1;
                    //System.out.println(start);
                } else if (arr[mid] <= arr[end]) {
                    end = mid - 1;
                    //System.out.println(end);
                }
            }
            System.out.println(result);
        }
    }
}
