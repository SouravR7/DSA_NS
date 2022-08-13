import java.util.Scanner;

public class MinCutTree {
    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int max = returnMax(array);
        int smallestNo = getMinCutPoint(array, max, number);
        System.out.println(smallestNo);
    }

    static int returnMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
    static int getMinCutPoint(int[] array, int max, int no){
        int low = 0;
        int high = max;
        int answer = max;
        while(low <= high){
            int sum = 0;
            int mid = (high+low)/2;
            for(int i=0; i<array.length; i++){
                sum += ( array[i] - mid > 0 ? array[i] - mid : 0);
            }
            if(sum <= no){
                answer = mid;
                high = mid - 1;
            }
            else if(sum > no){
                low = mid+1;
            }

        }
        return answer;
    }
}