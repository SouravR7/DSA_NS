import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int low = 0;
        int high = size-1;
        QuickSort(array,low,high);
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
    static void QuickSort(int[] array, int low, int high){
        if(low < high){
            int partitionIndex = partition(array,low,high);
            QuickSort(array,low,partitionIndex-1);
            QuickSort(array, partitionIndex+1,high);
        }

    }

    static int partition(int[] array, int low, int high){
        int l = low-1;
        int pivot = array[high];
        for(int i=low; i<high; i++){
            if(array[i] < pivot){
                l++;
                swap(array,i,l);
            }
        }
        swap(array,l+1,high);
        return (l+1);
    }
    static void swap(int[] array, int a, int b ){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}