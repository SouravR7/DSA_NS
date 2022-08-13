import java.util.Scanner;

public class KSum {
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number = sc.nextInt();
        int[] array = new int [size];
        for(int i=0; i<size;i++){
            array[i] = sc.nextInt();
        }
        int max = returnMax(array);
        int smallestNo = getSmallestdivider(array,max,number);
        System.out.println(smallestNo);
    }
    static int returnMax(int[] array){
        int max = 0;
        for(int i=0; i<array.length; i++){
            max = Math.max(max,array[i]);
        }
        return max;
    }

    static int getSmallestdivider(int[] array, int max, int num){
        int low = 0;
        int high = max;
        int answer = max;
        while(low < high){
            int mid = (high+low)/2;
            int sum =0;
            for(int i=0; i<array.length; i++){
                sum += Math.ceil((double)array[i]/mid);
            }
            if(sum <= num){
                answer = mid;
                high = mid-1;
                break;
            }
            else if(sum > num){
                low = mid+1;
            }
        }
       return answer;
    }
}
