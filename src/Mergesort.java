import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int t = sc.nextInt();
        //while (t-- > 0) {
            int arrsize = sc.nextInt();
            int[] arr = new int[arrsize];
            for (int i = 0; i < arrsize ; i++) {
                arr[i] = sc.nextInt();
                //System.out.print(arr[i]+" ");
            }
            //int start = 0;
            //int end = arrsize - 1 ;
           int[] sortedarr = implementMergeSort(arr, 0, arrsize-1);
            for(int i=0 ;i<arrsize;i++){
                System.out.print(sortedarr[i]+" ");
            }
        }
    //}


    public static int[] implementMergeSort(int[] arr, int start, int end) {
        if (start< end) {

            int mid = (start + end) / 2;
            implementMergeSort(arr, start, mid);
            implementMergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        return arr;
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int[] c = new int[end];
        //int[] sortedarr = new int[end];
        int i = start, j = mid+1, k = start;
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                c[k++] = arr[i++];
            }
            else
                c[k++] = arr[j++];
        }
        for( ;i < mid;i++){
            c[k++] = arr[i];
        }
        for( ;j < end;j++) {
            c[k++] = arr[j];
        }
        int a = start;
        while(a < k){
              arr[a] = c[a];
              a++;
            //System.out.print(c[a]+" ");
        }
    }
}