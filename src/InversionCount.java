import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        int count = inversionMerge(array,0,size-1);
        System.out.println(count);
    }
    static int inversionMerge(int[] array, int l, int h){
        int count = 0;
        if(l < h){
            int mid = (l + h)/2;
            count += inversionMerge(array,l, mid);
            count += inversionMerge(array, mid+1, h);
            count += Merge(array,l,mid,h);
        }
        return count;
    }

    static int Merge(int[] array, int l, int mid, int h){
        int[] newArray = new int[array.length];

        int i= 0, j = mid+1, k = 0;
        int count = 0;
        while(i< mid+1 && j < h+1){
            if(array[i] <= array[j]){
                newArray[k++] = array[i++];
            }
            else {
                newArray[k++] = array[j++];
                count += 1;
            }
        }
        while(i< mid+1){
            newArray[k++] = array[i++];
        }
        while(j< h+1){
            newArray[k++] = array[j++];
        }
        return count;
    }
}
